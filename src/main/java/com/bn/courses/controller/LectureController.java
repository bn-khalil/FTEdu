package com.bn.courses.controller;

import com.bn.courses.dto.LectureDTO;
import com.bn.courses.service.LectureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lecture")
public class LectureController {
    private final LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("/{section_id}")
    public ResponseEntity<LectureDTO> getLecture(@PathVariable Long lecture_id) {
        return ResponseEntity.ok(
                this.lectureService.findLecturesById(lecture_id)
        );
    }

    @GetMapping("/section/{course_id}")
    public ResponseEntity<List<LectureDTO>> getLecturesWithSections(@PathVariable Long section_id) {
        return ResponseEntity.ok(
                this.lectureService.findLecturesWithSection(section_id)
        );
    }

    @PostMapping("/create")
    public ResponseEntity<LectureDTO> createSection(@RequestBody LectureDTO lectureDTO) {
        return ResponseEntity.ok(
                this.lectureService.createNewLecture(lectureDTO)
        );
    }

    // update
    //delete
}
