package com.mamatha.migration.employee;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class EmployeeService {

    private final AtomicLong sequence = new AtomicLong();

    public Employee create(CreateEmployeeRequest request) {
        // TODO Session 1: convert the request DTO into a created Employee.
        throw new UnsupportedOperationException("Implement EmployeeService.create");
    }
}
