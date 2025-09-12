package com.bn.courses.mapper;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.dto.CourseDTO;
import com.bn.courses.model.Author;
import com.bn.courses.model.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseMapper {

    private SectionMapper sectionMapper;

    public CourseMapper( SectionMapper sectionMapper) {
        this.sectionMapper = sectionMapper;
    }

    public CourseDTO toCourseDTO(Course course){
        return CourseDTO.builder()
                .id(course.getId())
                .title(course.getTitle())
                .description(course.getDescription())
                .sections(this.sectionMapper.toSectionDTOList(course.getSections()))
                .build();
    }

    public Course toCourse(CourseDTO courseDTO){
        return Course.builder()
                .id(courseDTO.getId())
                .title(courseDTO.getTitle())
                .description(courseDTO.getDescription())
                .sections(this.sectionMapper.toSectionList(courseDTO.getSections()))
                .build();
    }

    public List<CourseDTO> toCourseDTOList(List<Course> courses){
        return courses.stream().map(this::toCourseDTOList).toList();
    }

    public List<Course> toCourseList(List<CourseDTO> courseDTO){
        return courseDTO.stream().map(this::toCourseList).toList();
    }
}
