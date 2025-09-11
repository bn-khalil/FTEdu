package com.bn.courses.service;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.model.Course;

import java.util.List;

public interface AuthorService {
    List<AuthorDTO> findAllAuthors();
}
