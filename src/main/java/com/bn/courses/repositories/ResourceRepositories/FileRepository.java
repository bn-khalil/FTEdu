package com.bn.courses.repositories.ResourceRepositories;

import com.bn.courses.model.resources.FileResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileResource, Long> {
}