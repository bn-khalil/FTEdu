package com.bn.courses.mapper.Resources;

import com.bn.courses.dto.ResourceDTO;
import com.bn.courses.mapper.LectureMapper;
import com.bn.courses.model.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class  RresourceMapper {

    private final LectureMapper lectureMapper;

    public RresourceMapper(@Lazy LectureMapper lectureMapper) {
        this.lectureMapper = lectureMapper;
    }

    public ResourceDTO toResourceDTO(Resource resource){
        return ResourceDTO.builder()
                .id(resource.getId())
                .name(resource.getName())
                .lectureId(resource.getLectureId())
//                .lectureDTO(this.lectureMapper.toLectureDTO(resource.getLecture()))
                .build();
    }

    public Resource toResource(ResourceDTO resourceDTO) {
        return Resource.builder()
                .id(resourceDTO.getId())
                .name(resourceDTO.getName())
                .lectureId(resourceDTO.getLectureId())
//                .lecture(this.lectureMapper.toLecture(resourceDTO.getLectureDTO()))
                .build();
    }

    public List<ResourceDTO> toResourceDTOList(List<Resource> resources) {
        return resources.stream().map(this::toResourceDTO).toList();
    }

    public List<Resource> toResourceList(List<ResourceDTO> resourceDTO) {
        return resourceDTO.stream().map(this::toResource).toList();
    }
}
