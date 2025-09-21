package com.bn.courses.serviceImpl;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.exception.NotFoundException;
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
    public List<AuthorDTO> findAllAuthorsByCourseId(Long course_Id) {
        List<Author> authors = this.authorRepository.findAuthorsByCourses_id(course_Id);
        return this.authorMapper.toAuthorDTOList(authors);
    }

    @Override
    public AuthorDTO findAuthorById(Long Id) {
        Optional<Author> author = this.authorRepository.findById(Id);
        return author
                .map(authorMapper::toAuthorDTO)
                .orElseThrow(
                        ()-> new NotFoundException("Author with id = " + Id + " Not Found!")
                );
    }

    @Override
    public void updateAuthor(AuthorDTO newAuthorDTO) {
        Author author = this.authorRepository
                .findById(newAuthorDTO.getId())
                .orElseThrow(
                        () -> new NotFoundException("there is no user with this id = " + newAuthorDTO.getId())
                );
        if (newAuthorDTO.getId() != null && !author.getId().equals(newAuthorDTO.getId()))
            author.setId(newAuthorDTO.getId());
        if (newAuthorDTO.getFirstName() != null && !author.getFirstName().equals(newAuthorDTO.getFirstName()))
            author.setFirstName(newAuthorDTO.getFirstName());
        if (newAuthorDTO.getLastName() != null && !author.getLastName().equals(newAuthorDTO.getLastName()))
            author.setLastName(newAuthorDTO.getLastName());
        if (newAuthorDTO.getAge() != null && !author.getAge().equals(newAuthorDTO.getAge()))
            author.setAge(newAuthorDTO.getAge());
        if (newAuthorDTO.getEmail() != null && !author.getEmail().equals(newAuthorDTO.getEmail()))
            author.setEmail(newAuthorDTO.getEmail());
        author.setUpdatedAt(newAuthorDTO.getUpdatedAt());
        this.authorRepository.save(author);
    }

    @Override
    public void deleteAuthorById(Long id) {
        this.authorRepository.deleteById(id);
    }

    @Override
    public AuthorDTO crateNewAuthor(AuthorDTO authorDTO) {
        Author author = this.authorMapper.toAuthor(authorDTO);
        Author insertedEntity = this.authorRepository.save(author);
        authorDTO.setId(insertedEntity.getId());
        return authorDTO;
    }
}
