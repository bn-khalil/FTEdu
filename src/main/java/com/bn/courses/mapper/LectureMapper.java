package com.bn.courses.mapper;

import com.bn.courses.dto.LectureDTO;
import com.bn.courses.mapper.Resources.RresourceMapper;
import com.bn.courses.model.Lecture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LectureMapper {

    private final RresourceMapper resourceMapper;

    public LectureMapper(RresourceMapper resourceMapper) {
        this.resourceMapper = resourceMapper;
    }

    public LectureDTO toLectureDTO(Lecture lecture){
        return LectureDTO.builder()
                .id(lecture.getId())
                .name(lecture.getName())
                .sectionId(lecture.getSectionId())
                .resourceId(lecture.getResourceId())
//                .resourceDTO(this.resourceMapper.toResourceDTO(lecture.getResource()))
                .build();
    }

    public Lecture toLecture(LectureDTO lectureDTO){
        return Lecture.builder()
                .id(lectureDTO.getId())
                .name(lectureDTO.getName())
                .sectionId(lectureDTO.getSectionId())
                .resourceId(lectureDTO.getResourceId())
//                .resource(this.resourceMapper.toResource(lectureDTO.getResourceDTO()))
                .build();
    }

    public List<LectureDTO> toLectureDTOList(List<Lecture> lecture){
        return lecture.stream().map(this::toLectureDTO).toList();
    }

    public List<Lecture> toLectureList(List<LectureDTO> lectureDTO){
        return lectureDTO.stream().map(this::toLecture).toList();
    }
}
