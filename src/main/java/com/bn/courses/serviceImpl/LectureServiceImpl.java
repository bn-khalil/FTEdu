package com.bn.courses.serviceImpl;

import com.bn.courses.dto.LectureDTO;
import com.bn.courses.dto.SectionDTO;
import com.bn.courses.exception.NotFoundException;
import com.bn.courses.mapper.LectureMapper;
import com.bn.courses.model.Lecture;
import com.bn.courses.model.Section;
import com.bn.courses.repositories.LectureRepository;
import com.bn.courses.service.LectureService;
import com.bn.courses.service.SectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureServiceImpl implements LectureService {
    private final LectureRepository lectureRepository;
    private final LectureMapper lectureMapper;

    public LectureServiceImpl(
            LectureRepository lectureRepository,
            LectureMapper lectureMapper
    ) {
        this.lectureRepository = lectureRepository;
        this.lectureMapper = lectureMapper;
    }

    @Override
    public List<LectureDTO> findLecturesById(Long id) {
        List<Lecture> lectures = this.lectureRepository.findSectionsBySectionId(id);
        return this.lectureMapper.toLectureDTOList(lectures);
    }

    @Override
    public LectureDTO findLecturesWithSection(Long id) {
        Lecture lecture = this.lectureRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Lecture not found with this id = " + id)
        );
        return this.lectureMapper.toLectureDTO(lecture);
    }

    @Override
    public LectureDTO createNewLecture(LectureDTO lectureDTO) {
        Lecture lecture = this.lectureMapper.toLecture(lectureDTO);
        Lecture insertedEntity = this.lectureRepository.save(lecture);
        lectureDTO.setId(insertedEntity.getId());
        return lectureDTO;
    }
}
