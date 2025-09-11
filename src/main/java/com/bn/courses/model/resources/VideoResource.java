package com.bn.courses.model.resources;

import com.bn.courses.model.Resource;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@Entity
//@DiscriminatorValue("VIDEO")
@PrimaryKeyJoinColumn(name = "video_id")
public class VideoResource extends Resource {
    private int length;
}
