package com.bn.courses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    private String createdBy;
    @Column(insertable = false)
    private String updatedBy;

    @CreationTimestamp
    @Column(
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
