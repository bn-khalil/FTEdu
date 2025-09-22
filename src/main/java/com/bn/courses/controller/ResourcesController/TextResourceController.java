package com.bn.courses.controller.ResourcesController;

import com.bn.courses.dto.resourcesDTO.TextResourceDTO;
import com.bn.courses.repositories.ResourceRepositories.TextRepository;
import com.bn.courses.service.ResourceServices.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("resource")
public class TextResourceController {

    private final TextService testService;

    @Autowired
    public TextResourceController(TextService testService) {
        this.testService = testService;
    }

    @GetMapping("/text/{resource_id}")
    public ResponseEntity<TextResourceDTO> getTextResource(@PathVariable Long resource_id){
        return ResponseEntity.ok( this.testService.findTextById(resource_id));
    }

    @PostMapping("/text/create")
    public ResponseEntity<TextResourceDTO> addTextResource(@RequestBody TextResourceDTO textResourceDTO){
        return ResponseEntity.ok(this.testService.addNewTextResource(textResourceDTO));
    }
}
