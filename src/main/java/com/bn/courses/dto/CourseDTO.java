package com.bn.courses.dto;

import com.bn.courses.model.Section;
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
public class CourseDTO {

    private Long id;

    private String title;

    private String description;

    private List<AuthorDTO> authorsDTO;

    private List<SectionDTO> sectionsDTO;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
