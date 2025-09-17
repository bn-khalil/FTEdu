package com.bn.courses.repositories;

import com.bn.courses.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
    List<Section> findSectionsByCourse_id(Long id);
}

