package com.bn.courses.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "lecture")
public class Lecture extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(name = "section_id")
    private Long sectionId;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}
