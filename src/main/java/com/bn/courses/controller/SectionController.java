package com.bn.courses.controller;

import com.bn.courses.dto.SectionDTO;
import com.bn.courses.model.Section;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services")
public class SectionController {

    @GetMapping("/")
    public ResponseEntity<SectionDTO> getAllSection() {
        return null;
    }
}
