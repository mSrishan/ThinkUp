package com.msrishan.thinkup.programserviceapi.service.impl;

import com.msrishan.thinkup.programserviceapi.dto.RequestProgramDto;
import com.msrishan.thinkup.programserviceapi.entity.Program;
import com.msrishan.thinkup.programserviceapi.repo.ProgramRepository;
import com.msrishan.thinkup.programserviceapi.service.ProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProgramServiceImpl implements ProgramService {

    private final ProgramRepository programRepository;



    @Override
    public void createProgram(RequestProgramDto programDto) {

        Program program = Program.builder()
                        .name(programDto.getName())
                                .price(programDto.getPrice())
                                        .startDate(programDto.getStartDate())
                                                .subjects(programDto.getSubjects())
                .build();


    programRepository.save(program);
    }
}
