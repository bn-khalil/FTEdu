package com.bn.courses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table  (name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private     Long id;
    @Column(
            name = "first_name",
            nullable = false,
            length = 20
    )
    private     String firstName;
    @Column(
            name = "last_name",
            nullable = false,
            length = 100
    )
    private     String lastName;
    @Column(
            nullable = false,
            unique = true
    )
    private     String email;
    @Column( nullable = false )
    private     Integer age;
    @CreationTimestamp
    @Column (
            name = "create_at",
            updatable = false
    )
    private     LocalDateTime createAt;
    @UpdateTimestamp
    @Column (
            name = "updated_at",
            insertable = false
    )
    private     LocalDateTime updatedAt;
}


