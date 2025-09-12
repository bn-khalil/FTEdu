package com.bn.courses.mapper;

import com.bn.courses.dto.AuthorDTO;
import com.bn.courses.model.Author;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorMapper {
    public AuthorDTO toAuthorDTO(Author author){
        return AuthorDTO.builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .email(author.getEmail())
                .age(author.getAge())
                .build();
    }
    public Author toAuthor(AuthorDTO authordto){
        return Author.builder()
                .id(authordto.getId())
                .firstName(authordto.getFirstName())
                .lastName(authordto.getLastName())
                .email(authordto.getEmail())
                .age(authordto.getAge())
                .build();
    }
    public List<AuthorDTO> toAuthorDTOList(List<Author> authors){
        return authors.stream().map(this::toAuthorDTO).toList();
    }
    public List<Author> toAuthorList(List<AuthorDTO> authorsdto){
        return authorsdto.stream().map(this::toAuthor).toList();
    }
}
