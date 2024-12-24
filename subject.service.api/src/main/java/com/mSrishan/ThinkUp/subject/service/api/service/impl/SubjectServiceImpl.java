package com.mSrishan.ThinkUp.subject.service.api.service.impl;

import com.mSrishan.ThinkUp.subject.service.api.dto.request.RequestSubjectDto;
import com.mSrishan.ThinkUp.subject.service.api.entity.Subject;
import com.mSrishan.ThinkUp.subject.service.api.repository.SubjectRepository;
import com.mSrishan.ThinkUp.subject.service.api.service.SubjectService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    
    @Override
    public void createSubject(RequestSubjectDto dto) {
        Subject subject = Subject.builder()
                .name(dto.getName())
                .status(dto.isStatus()).build();
        subjectRepository.save(subject);
    }
}
