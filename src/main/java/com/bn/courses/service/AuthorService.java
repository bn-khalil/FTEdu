package com.bn.courses.service;

import com.bn.courses.dto.AuthorDTO;

import java.util.List;

public interface AuthorService {
    List<AuthorDTO> findAllAuthors();
    List<AuthorDTO> findAllAuthorsByCourseId(Long course_Id);
    AuthorDTO       findAuthorById(Long Id);
    AuthorDTO       crateNewAuthor(AuthorDTO authorDTO);
    void            updateAuthor(AuthorDTO newAuthorDTO);
    void            deleteAuthorById(Long id);
}
