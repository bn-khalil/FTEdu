package com.bn.courses.serviceImpl;

import com.bn.courses.dto.CourseDTO;
import com.bn.courses.exception.NotFoundException;
import com.bn.courses.mapper.CourseMapper;
import com.bn.courses.model.Course;
import com.bn.courses.repositories.CourseRepository;
import com.bn.courses.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseMapper courseMapper;
    private final CourseRepository courseRepository;

    public CourseServiceImpl(
            CourseMapper courseMapper,
            CourseRepository courseRepository
    ){
        this.courseMapper = courseMapper;
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseDTO> findAllCourses() {
        return this.courseMapper.toCourseDTOList(courseRepository.findAll());
    }

    @Override
    public List<CourseDTO> findAllCoursesByAuthorId(Long id) {
        List<Course> courses = this.courseRepository.findByAuthors_Id(id);
        return this.courseMapper.toCourseDTOList(courses);
    }

    @Override
    public CourseDTO findCourseById(Long id) {
        Optional<Course> course = this.courseRepository.findById(id);

        return course
                .map(courseMapper::toCourseDTO)
                .orElseThrow(
                        ()-> new NotFoundException("No Course Found With This Id = " + id)
                );
    }

    @Override
    public CourseDTO crateNewCourse(CourseDTO authorDTO) {
        return null;
    }

    @Override
    public void updateCourse(CourseDTO newAuthorDTO) {

    }
}
