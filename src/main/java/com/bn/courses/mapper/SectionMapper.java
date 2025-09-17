package com.bn.courses.mapper;

import com.bn.courses.dto.SectionDTO;
import com.bn.courses.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SectionMapper {
    private final LectureMapper lectureMapper;

    @Autowired
    public SectionMapper(LectureMapper lectureMapper) {
        this.lectureMapper = lectureMapper;
    }

    public SectionDTO toSectionDTO(Section section){
        return SectionDTO.builder()
                .id(section.getId())
                .name(section.getName())
                .course(section.getCourse())
//                .lectures(this.lectureMapper.toLectureDTOList(section.getLectures()))
                .sectionOrder(section.getSectionOrder())
                .build();
    }

    public Section toSection(SectionDTO sectionDTO){
        return Section.builder()
                .id(sectionDTO.getId())
                .name(sectionDTO.getName())
                .course(sectionDTO.getCourse())
//                .lectures(this.lectureMapper.toLectureList(sectionDTO.getLectures()))
                .sectionOrder(sectionDTO.getSectionOrder())
                .build();
    }

    public List<SectionDTO> toSectionDTOList(List<Section> section){
        return section.stream().map(this::toSectionDTO).toList();
    }

    public List<Section> toSectionList(List<SectionDTO> sectionDTO){
        return sectionDTO.stream().map(this::toSection).toList();
    }
}
