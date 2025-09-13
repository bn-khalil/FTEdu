package com.bn.courses.service;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.model.Course;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<AuthorDTO> findAllAuthors();
    AuthorDTO       findAuthorById(Long Id);
    AuthorDTO       crateNewAuthor(AuthorDTO authorDTO);
    void            updateAuthor(AuthorDTO newAuthorDTO);
    void            deleteAuthorById(Long id);
}
