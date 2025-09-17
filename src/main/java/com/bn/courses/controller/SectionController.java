package com.bn.courses.controller;

import com.bn.courses.dto.SectionDTO;
import com.bn.courses.repositories.SectionRepository;
import com.bn.courses.service.SectionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("sections")
public class SectionController {

    private final SectionService sectionService;

    public SectionController(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @GetMapping("/course/{course_id}")
    public ResponseEntity<List<SectionDTO>> getSectionsWithCourse(@PathVariable Long course_id) {
        return ResponseEntity.ok(
                this.sectionService.findServicesWithCourseId(course_id)
        );
    }
}
