package com.bn.courses.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "sections")
public class Section extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(
            name = "course_id",
            nullable = false
    )
    private Long course;

    @OneToMany(mappedBy = "sectionId")
    private List<Lecture> lectures;
    private int sectionOrder;
}
