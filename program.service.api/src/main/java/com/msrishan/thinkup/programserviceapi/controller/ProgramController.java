package com.msrishan.thinkup.programserviceapi.controller;

import com.msrishan.thinkup.programserviceapi.dto.RequestProgramDto;
import com.msrishan.thinkup.programserviceapi.service.ProgramService;
import com.msrishan.thinkup.programserviceapi.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/programs")
@RequiredArgsConstructor
public class ProgramController {

     private final ProgramService programService;



    @PostMapping
    private ResponseEntity<StandardResponse> createProgram(
            @RequestBody RequestProgramDto requestProgramDto
    ){
        programService.createProgram(requestProgramDto);
        return new ResponseEntity<>(
                new StandardResponse(201, "Program was saved",
                        requestProgramDto.getName()),
                HttpStatus.CREATED
        );
    }
}
