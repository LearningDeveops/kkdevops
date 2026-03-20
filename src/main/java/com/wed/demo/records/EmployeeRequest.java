package com.wed.demo.records;

import jakarta.validation.constraints.*;

public record EmployeeRequest(

        @NotBlank String name,
        @Email String email,
        @Positive Double salary,
        String department
) {}