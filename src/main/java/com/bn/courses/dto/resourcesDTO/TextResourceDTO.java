package com.bn.courses.dto.resourcesDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TextResourceDTO {
    private Long id;

    private String name;

    private String content;

    private Long lectureId;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
