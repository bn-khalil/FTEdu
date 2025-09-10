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
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue
    private     Long id;

    @Column(
            name = "title",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private     String title;

    @Column(
            name = "description",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private     String description;

    @CreationTimestamp
    @Column (
            name = "create_at",
            updatable = false
    )
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column (
            name = "updated_at",
            insertable = false
    )
    private     LocalDateTime updatedAt;
}
