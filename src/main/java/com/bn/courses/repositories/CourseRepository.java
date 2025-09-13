package com.bn.courses.repositories;

import com.bn.courses.model.Author;
import com.bn.courses.model.Course;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthors_Id(Long id);

//    List<Course> findByTitle(String title);
//    List<Course> findByTitleIgnoreCase(String title);
//    List<Course> findByTitleContainingIgnoreCase(String title);
//    List<Course> findByTitleStartsWithIgnoreCase(String title);
//    List<Course> findByTitleEndsWithIgnoreCase(String title);
//    List<Course> findByTitleInIgnoreCase(List<String> title);
//    @EntityGraph(attributePaths = "sections")
}