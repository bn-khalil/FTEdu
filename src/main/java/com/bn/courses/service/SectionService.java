package com.bn.courses.service;

import com.bn.courses.dto.SectionDTO;

import java.util.List;

public interface SectionService {
    public List<SectionDTO> findSectionsWithCourse(Long id);
    public SectionDTO findSectionById (Long id);
    public SectionDTO createNewSection(SectionDTO sectionDTO);
}
