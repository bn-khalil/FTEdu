package com.bn.courses.controller;

import com.bn.courses.dto.SectionDTO;
import com.bn.courses.repositories.SectionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services")
public class SectionController {

    private final SectionRepository sectionRepository;

    public SectionController(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @GetMapping("/")
    public ResponseEntity<SectionDTO> getAllSection() {
        return ResponseEntity.ok(this.sectionRepository.find);
    }
}
