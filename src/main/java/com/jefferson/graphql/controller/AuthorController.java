package com.jefferson.graphql.controller;

import com.jefferson.graphql.model.Author;
import com.jefferson.graphql.repository.IAuthorRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    private final IAuthorRepository authorRepository;

    public AuthorController(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @QueryMapping
    Iterable<Author> authors() {
        return this.authorRepository.findAll();
    }

}
