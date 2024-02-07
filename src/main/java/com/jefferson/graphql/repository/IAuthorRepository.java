package com.jefferson.graphql.repository;

import com.jefferson.graphql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, String> {
}
