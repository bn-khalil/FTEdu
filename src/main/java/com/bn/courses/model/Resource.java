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
@Table(name = "resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private int size;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

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
    private LocalDateTime updatedAt;
}
