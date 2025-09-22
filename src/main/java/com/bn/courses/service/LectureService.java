package com.bn.courses.service;

import com.bn.courses.dto.LectureDTO;

import java.util.List;

public interface LectureService {
    public List<LectureDTO> findLecturesBySectionId(Long id);
    public LectureDTO findLectureById (Long id);
    public LectureDTO createNewLecture(LectureDTO lectureDTO);
}
