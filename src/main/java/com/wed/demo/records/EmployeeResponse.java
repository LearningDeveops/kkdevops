package com.wed.demo.records;

public record EmployeeResponse(
        Long id,
        String name,
        String email,
        Double salary,
        String department
) {}