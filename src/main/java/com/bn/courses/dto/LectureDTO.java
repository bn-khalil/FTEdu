package com.bn.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LectureDTO {
    private Long id;

    private String name;

    private Section section;

    private ResourceDTO resourceDTO;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
