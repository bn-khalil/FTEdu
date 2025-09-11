package com.bn.courses.serviceImpl;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.model.Author;
import com.bn.courses.repositories.AuthorRepository;
import com.bn.courses.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorDTO> findAllAuthors() {
        List<Author> authors = authorRepository.findAll();
    }
}
