package com.habimana.crud.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty(message = "firstName should not be empty")
        String firstName,
        @NotEmpty(message = "lastName should not be empty")
        String lastName,
        @NotEmpty(message = "email should not be empty")
        String email,
        @NotEmpty(message = "age should not be empty")
        Integer age,
        @NotEmpty(message = "student should have school")
        Integer schoolId
) {
}
