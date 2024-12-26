package com.mSrishan.ThinkUp.subject.service.api.service;

import com.mSrishan.ThinkUp.subject.service.api.dto.request.RequestSubjectDto;
import lombok.AllArgsConstructor;

import java.util.List;


public interface SubjectService {

    public  void createSubject(RequestSubjectDto dto);

    public boolean isListAvailable(List<Long> ids);
}


