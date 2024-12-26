package com.mSrishan.ThinkUp.subject.service.api.repository;

import com.mSrishan.ThinkUp.subject.service.api.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    List<Subject> findByIdIn(List<Long> ids);
}
