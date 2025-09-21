package com.bn.courses.repositories;

import com.bn.courses.model.Author;
import com.bn.courses.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {

}