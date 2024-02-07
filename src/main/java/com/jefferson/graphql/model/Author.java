package com.jefferson.graphql.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table
@Setter
@Getter
public class Author {

    @Id
    private String ID;
    private String firstName;
    private String lastName;
}
