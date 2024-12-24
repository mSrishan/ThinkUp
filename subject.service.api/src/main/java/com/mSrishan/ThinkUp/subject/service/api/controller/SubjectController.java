package com.mSrishan.ThinkUp.subject.service.api.controller;



import com.mSrishan.ThinkUp.subject.service.api.dto.request.RequestSubjectDto;
import com.mSrishan.ThinkUp.subject.service.api.service.SubjectService;
import com.mSrishan.ThinkUp.subject.service.api.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/subjects")
@RequiredArgsConstructor
public class SubjectController {

    private final SubjectService subjectService;



    @PostMapping
    private ResponseEntity<StandardResponse> createSubject(
            @RequestBody RequestSubjectDto requestSubjectDto
    ){
        subjectService.createSubject(requestSubjectDto);
        return new ResponseEntity<>(
                new StandardResponse(201, "Subject was saved",
                    requestSubjectDto.getName())    ,
                HttpStatus.CREATED
        );
    }

}