package com.bn.courses.serviceImpl;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.exception.AuthorNotFoundException;
import com.bn.courses.mapper.AuthorMapper;
import com.bn.courses.model.Author;
import com.bn.courses.repositories.AuthorRepository;
import com.bn.courses.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Autowired
    public AuthorServiceImpl(
            AuthorRepository authorRepository,
            AuthorMapper authorMapper
    ){
        this.authorMapper = authorMapper;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorDTO> findAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        return this.authorMapper.toAuthorDTOList(authors);
    }

    @Override
    public AuthorDTO findAuthorById(Long Id) {
        Optional<Author> author = this.authorRepository.findById(Id);
        return author
                .map(authorMapper::toAuthorDTO)
                .orElseThrow(
                        ()-> new AuthorNotFoundException("Author with id = " + Id + " Not Found!")
                );
    }

    @Override
    public void updateAuthor(AuthorDTO newAuthorDTO) {
        this.authorRepository.save(
          this.authorMapper.toAuthor(newAuthorDTO)
        );
    }

    @Override
    public AuthorDTO crateNewAuthor(AuthorDTO authorDTO) {
        Author author = this.authorMapper.toAuthor(authorDTO);
        this.authorRepository.save(author);
        return authorDTO;
    }
}
