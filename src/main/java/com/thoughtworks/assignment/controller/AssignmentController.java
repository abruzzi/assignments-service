package com.thoughtworks.assignment.controller;

import com.thoughtworks.assignment.model.Assignments;
import com.thoughtworks.assignment.repos.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/assignments")
public class AssignmentController {
    @Autowired
    private AssignmentRepository assignmentRepository;

    @RequestMapping(value = "{employeeId}", method = RequestMethod.GET)
    public Assignments findAssignmentsFor(@PathVariable(value = "employeeId") String employeeId) {
        return assignmentRepository.findByEmployeeId(employeeId);
    }
}
