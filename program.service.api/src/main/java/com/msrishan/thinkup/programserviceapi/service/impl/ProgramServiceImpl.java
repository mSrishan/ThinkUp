package com.msrishan.thinkup.programserviceapi.service.impl;

import com.msrishan.thinkup.programserviceapi.dto.request.RequestProgramDto;
import com.msrishan.thinkup.programserviceapi.entity.Program;
import com.msrishan.thinkup.programserviceapi.entity.Subject;
import com.msrishan.thinkup.programserviceapi.repo.ProgramRepository;
import com.msrishan.thinkup.programserviceapi.service.ProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProgramServiceImpl implements ProgramService {

    private final ProgramRepository programRepository;
    private final WebClient webClient;

    @Override
    public void createProgram(RequestProgramDto programDto) {
        Program program = Program.builder()
                .name(programDto.getName())
                .price(programDto.getPrice())
                .startDate(programDto.getStartDate())
                .subjects(programDto.getSubjects())
                .build();

        ArrayList<Long> list = new ArrayList<>();
        for (Subject sub:program.getSubjects()
        ) {
            list.add(sub.getId());
        }
        String ids =  list.stream().map(Object::toString).collect(Collectors.joining(", "));

        System.out.println(ids);

        Boolean isOk = webClient.get().uri("http://localhost:8082/api/v1/subjects/{id}",ids)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if(Boolean.TRUE.equals(isOk)){
            programRepository.save(program);
        }else{
            throw new IllegalArgumentException("Try again with available Languages");
        }

    }
}