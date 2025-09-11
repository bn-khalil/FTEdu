package com.bn.courses.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@Table  (name = "authors")
@NamedQueries(
        {
                @NamedQuery(
                        name = "Author.findByNamedQuery",
                        query = "select a from Author a where a.age = :age"
                ),
                @NamedQuery(
                        name = "Author.updateByNamedQuery",
                        query = "update Author a set a.age = :age where a.id = :id"
                ),
        }
)

public class Author extends BaseEntity {
    @Column(
            nullable = false,
            length = 20
    )
    private String firstName;

    @Column(
            nullable = false,
            length = 100
    )
    private String lastName;

    @Column(
            nullable = false,
            unique = true
    )
    private String email;

    private Integer age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}


