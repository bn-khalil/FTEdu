package com.bn.courses.service;


import com.bn.courses.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    List<CourseDTO> findAllCourses();
    List<CourseDTO> findAllCoursesByAuthorId(Long id);
    CourseDTO       findCourseById(Long Id);
    CourseDTO       crateNewCourse(CourseDTO authorDTO);
    void            updateCourse(CourseDTO newAuthorDTO);
}
