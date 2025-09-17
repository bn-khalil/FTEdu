package com.bn.courses.serviceImpl;

import com.bn.courses.dto.SectionDTO;
import com.bn.courses.exception.NotFoundException;
import com.bn.courses.mapper.SectionMapper;
import com.bn.courses.model.Section;
import com.bn.courses.repositories.SectionRepository;
import com.bn.courses.service.SectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {
    private final SectionRepository sectionRepository;
    private final SectionMapper sectionMapper;

    public SectionServiceImpl(
            SectionRepository sectionRepository,
            SectionMapper sectionMapper
    ) {
        this.sectionRepository = sectionRepository;
        this.sectionMapper = sectionMapper;
    }

    @Override
    public List<SectionDTO> findServicesWithCourseId(Long id) {
        List<Section> sections = this.sectionRepository.findSectionsByCourse_id(id);
        return this.sectionMapper.toSectionDTOList(sections);
    }

    @Override
    public SectionDTO findServiceById(Long id) {
        Section section = this.sectionRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Section not found with this id = " + id)
        );
        return this.sectionMapper.toSectionDTO(section);
    }
}
