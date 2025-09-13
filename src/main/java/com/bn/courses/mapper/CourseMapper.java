package com.bn.courses.mapper;

import com.bn.courses.dto.CourseDTO;
import com.bn.courses.model.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseMapper {

    private final SectionMapper sectionMapper;
    private final AuthorMapper authorMapper;

    public CourseMapper(
            SectionMapper sectionMapper,
            AuthorMapper authorMapper
    ) {
        this.sectionMapper = sectionMapper;
        this.authorMapper = authorMapper;
    }

    public CourseDTO toCourseDTO(Course course){
        return CourseDTO.builder()
                .id(course.getId())
                .title(course.getTitle())
                .description(course.getDescription())
//                .sectionsDTO(this.sectionMapper.toSectionDTOList(course.getSections()))
//                .authorsDTO(this.authorMapper.toAuthorDTOList(course.getAuthors()))
                .build();
    }

    public Course toCourse(CourseDTO courseDTO){
        return Course.builder()
                .id(courseDTO.getId())
                .title(courseDTO.getTitle())
                .description(courseDTO.getDescription())
//                .sections(this.sectionMapper.toSectionList(courseDTO.getSectionsDTO()))
//                .authors(this.authorMapper.toAuthorList(courseDTO.getAuthorsDTO()))
                .build();
    }

    public List<CourseDTO> toCourseDTOList(List<Course> courses){
        return courses.stream().map(this::toCourseDTO).toList();
    }

    public List<Course> toCourseList(List<CourseDTO> courseDTO){
        return courseDTO.stream().map(this::toCourse).toList();
    }
}
