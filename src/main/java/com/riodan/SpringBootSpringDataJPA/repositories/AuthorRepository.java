package com.riodan.SpringBootSpringDataJPA.repositories;

import com.riodan.SpringBootSpringDataJPA.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
