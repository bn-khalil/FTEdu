package com.bn.courses.repositories.ResourceRepositories;

import com.bn.courses.model.resources.VideoResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoResource, Long> {
}