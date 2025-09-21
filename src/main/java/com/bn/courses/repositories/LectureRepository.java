package com.bn.courses.repositories;

import com.bn.courses.model.Author;
import com.bn.courses.model.Lecture;
import com.bn.courses.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {
    List<Lecture> findSectionsBySectionId(Long id);
}