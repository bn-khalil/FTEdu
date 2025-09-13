package com.bn.courses.controller;

import com.bn.courses.dto.CourseDTO;
import com.bn.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CourseConroller {

    private final CourseService courseService;

    @Autowired
    public CourseConroller( CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDTO> getAllCourses(){
        return this.courseService.findAllCourses();
    }

    @GetMapping("/{course_id}")
    @ResponseStatus(HttpStatus.OK)
    public CourseDTO getCourse(@PathVariable Long course_id){
        return this.courseService.findCourseById(course_id);
    }

    @GetMapping("/author/{author_id}")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDTO> getAllCoursesByAuthor(@PathVariable Long author_id){
        return this.courseService.findAllCoursesByAuthorId(author_id);
    }

}
