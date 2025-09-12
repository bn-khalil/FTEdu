package com.bn.courses.repositories;

import com.bn.courses.model.Author;
import com.bn.courses.model.Course;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
//    @Modifying
//    @Transactional
//    @Query("update Author a set a.age = :age where a.id = :id")
//    void updateAuthorAge(int age, Long id);
//
//    List<Author> findByNamedQuery(@Param("age") int age);
//
//    @Modifying
//    @Transactional
//    void updateByNamedQuery(@Param("age") int age, @Param("id") Long id);
//
//    List<Author> findByFirstNameContainingIgnoreCase(String firstname);
    Optional<Author> findById(Long Id);
}
