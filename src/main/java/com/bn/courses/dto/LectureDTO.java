package com.bn.courses.dto;

import com.bn.courses.model.Section;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LectureDTO {
    private Long id;

    private String name;

    private Long sectionId;

    private ResourceDTO resourceDTO;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
