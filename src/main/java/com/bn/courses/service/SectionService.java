package com.bn.courses.service;

import com.bn.courses.dto.SectionDTO;

import java.util.List;

public interface SectionService {
    public List<SectionDTO> findServicesWithCourseId(Long id);
    public SectionDTO findServiceById(Long id);
}
