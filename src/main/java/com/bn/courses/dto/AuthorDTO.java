package com.bn.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AuthorDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;

    private List<CourseDTO> coursesDTO;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}