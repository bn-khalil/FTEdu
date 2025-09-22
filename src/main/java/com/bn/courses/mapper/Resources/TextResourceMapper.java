package com.bn.courses.mapper.Resources;

import com.bn.courses.dto.resourcesDTO.TextResourceDTO;
import com.bn.courses.mapper.LectureMapper;
import com.bn.courses.model.resources.TextResource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TextResourceMapper {
    private final LectureMapper lectureMapper;

    public TextResourceMapper(@Lazy LectureMapper lectureMapper) {
        this.lectureMapper = lectureMapper;
    }

    public TextResourceDTO toTextResourceDTO(TextResource textResource){
        return TextResourceDTO.builder()
                .id(textResource.getId())
                .name(textResource.getName())
                .lectureId(textResource.getLectureId())
                .content(textResource.getContent())
                .lectureId(textResource.getLectureId())
                .build();
    }

    public TextResource toTextResource(TextResourceDTO textResourceDTO) {
        return TextResource.builder()
                .id(textResourceDTO.getId())
                .name(textResourceDTO.getName())
                .lectureId(textResourceDTO.getLectureId())
                .content(textResourceDTO.getContent())
                .lectureId(textResourceDTO.getLectureId())
                .build();
    }

    public List<TextResourceDTO> toTextResourceDTOList(List<TextResource> textResources) {
        return textResources.stream().map(this::toTextResourceDTO).toList();
    }

    public List<TextResource> toResourceList(List<TextResourceDTO> textResourceDTOs) {
        return textResourceDTOs.stream().map(this::toTextResource).toList();
    }
}
