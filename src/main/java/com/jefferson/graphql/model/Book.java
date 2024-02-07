package com.jefferson.graphql.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table
@Setter
@Getter
public class Book {

    @Id
    private String ID;
    private String name;
    private int pageCount;
    private String authorID;
}
