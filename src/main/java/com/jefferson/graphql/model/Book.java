package com.jefferson.graphql.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ID;
    private String name;
    private String publisher;
    private int numberOfPages;
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    public Book(String ID, String name, String publisher, int numberOfPages, Author author) {
        this.ID = ID;
        this.name = name;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }
}
