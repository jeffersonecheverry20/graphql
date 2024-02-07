package com.jefferson.graphql;

import com.jefferson.graphql.model.Author;
import com.jefferson.graphql.model.Book;
import com.jefferson.graphql.repository.IAuthorRepository;
import com.jefferson.graphql.repository.IBookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	// This allows us to create data in our database once we stand up the backend application.
	@Bean
	ApplicationRunner applicationRunner(IAuthorRepository authorRepository, IBookRepository bookRepository) {
		return args -> {
			Author mathew = authorRepository.save(new Author(null, "Mathew", "Echeverry"));
			Author jefferson = authorRepository.save(new Author(null, "Jefferson", "Echeverry"));
			bookRepository.saveAll(List.of(
				new Book(null, "GraphQL1", "Colombia Publisher", 300, jefferson),
				new Book(null, "GraphQL2", "Colombia Publisher", 200, mathew),
				new Book(null, "GraphQL3", "Colombia Publisher", 200, mathew)
			));
		};
	}

}
