package com.bn.courses.controller;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.service.AuthorService;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.OK)
    public List<AuthorDTO> getAllAuthors() {
        return authorService.findAllAuthors();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthorDTO createAuthor(@RequestBody AuthorDTO newAuthorDTO) {
        return authorService.crateNewAuthor(newAuthorDTO);
    }

    @GetMapping("/{author_id}")
    @ResponseStatus(HttpStatus.OK)
    public AuthorDTO getAuthor(@PathVariable Long author_id) {
        return authorService.findAuthorById(author_id);
    }

    @PutMapping("/update/{author_id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateAuthor(
            @PathVariable Long author_id,
            @RequestBody AuthorDTO authorDTO
    ) {
        authorDTO.setId(author_id);
        authorService.updateAuthor(authorDTO);
    }

    @DeleteMapping("/delete/{author_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAuthor(@PathVariable Long author_id) {
        this.authorService.deleteAuthorById(author_id);
    }
}
