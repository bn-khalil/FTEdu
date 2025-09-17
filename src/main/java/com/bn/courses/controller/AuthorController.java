package com.bn.courses.controller;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController (AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/")
    public ResponseEntity<List<AuthorDTO>> getAllAuthors() {
        return ResponseEntity.ok(authorService.findAllAuthors());
    }

    @PostMapping("/")
    public ResponseEntity<AuthorDTO> createAuthor(@RequestBody AuthorDTO newAuthorDTO) {
        return ResponseEntity
                .ok(authorService.crateNewAuthor(newAuthorDTO));
    }

    @GetMapping("/{author_id}")
    public ResponseEntity<AuthorDTO> getAuthor(@PathVariable Long author_id) {
        return ResponseEntity.ok(authorService.findAuthorById(author_id));
    }

    @GetMapping("/courses/{course_id}")
    public ResponseEntity<List<AuthorDTO>> getCourseAuthors(@PathVariable Long course_id) {
        return ResponseEntity.ok(authorService.findAllAuthorsByCourseId(course_id));
    }

    @PutMapping("/update/{author_id}")
    public ResponseEntity<String> updateAuthor(
            @PathVariable Long author_id,
            @RequestBody AuthorDTO authorDTO
    ) {
        authorDTO.setId(author_id);
        authorService.updateAuthor(authorDTO);
        return ResponseEntity.ok("author with id = " + author_id + " updated successful!");
    }

    @DeleteMapping("/delete/{author_id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable Long author_id) {
        this.authorService.deleteAuthorById(author_id);
        return ResponseEntity.ok("Author with id = " + author_id + " deleted successful!");
    }
}
