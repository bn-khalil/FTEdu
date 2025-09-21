package com.bn.courses.dto;

import com.bn.courses.model.Course;
import com.bn.courses.model.Lecture;
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
public class SectionDTO {
    private Long id;

    private String name;

    private Long course;

    private List<LectureDTO> lectures;

    private int sectionOrder;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
