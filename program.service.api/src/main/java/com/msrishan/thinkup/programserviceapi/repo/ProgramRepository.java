package com.msrishan.thinkup.programserviceapi.repo;

import com.msrishan.thinkup.programserviceapi.entity.Program;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends MongoRepository<Program, String> {
}
