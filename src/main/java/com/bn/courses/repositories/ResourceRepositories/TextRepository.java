package com.bn.courses.repositories.ResourceRepositories;

import com.bn.courses.model.resources.TextResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<TextResource, Long> {
}
