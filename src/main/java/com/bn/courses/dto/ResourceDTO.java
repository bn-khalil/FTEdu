package com.bn.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResourceDTO {
    private Long id;

    private String name;

    private LectureDTO lecture;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
