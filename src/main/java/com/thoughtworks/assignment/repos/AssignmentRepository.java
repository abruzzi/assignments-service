package com.thoughtworks.assignment.repos;

import com.thoughtworks.assignment.model.Assignments;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssignmentRepository extends MongoRepository<Assignments, String> {
    Assignments findByEmployeeId(String employeeId);
}
