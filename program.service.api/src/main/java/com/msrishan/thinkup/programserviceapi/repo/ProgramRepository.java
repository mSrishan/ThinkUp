package com.msrishan.thinkup.programserviceapi.repo;

import com.msrishan.thinkup.programserviceapi.entity.Program;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProgramRepository extends MongoRepository<Program, String> {
}
