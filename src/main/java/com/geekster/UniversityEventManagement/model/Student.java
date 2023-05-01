package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String firstName;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String lastName;

    @Max(value = 25)
    @Min(value = 18)
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;
}
