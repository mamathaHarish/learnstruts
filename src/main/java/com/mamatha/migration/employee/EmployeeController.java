package com.mamatha.migration.employee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // TODO Session 1:
    // 1. Map POST /api/employees.
    // 2. Read CreateEmployeeRequest from JSON.
    // 3. Call employeeService.create(...).
    // 4. Return the employee with HTTP 201 Created.
}
