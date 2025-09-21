package com.bn.courses.service;

import com.bn.courses.dto.LectureDTO;
import com.bn.courses.dto.SectionDTO;

import java.util.List;

public interface LectureService {
    public List<LectureDTO> findLecturesWithSection(Long id);
    public LectureDTO findLecturesById (Long id);
    public LectureDTO createNewLecture(LectureDTO lectureDTO);
}
