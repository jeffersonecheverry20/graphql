# GraphQL

We are going to build an application with Java and GraphQL. For this we need to have the following tools:

- Java 17
- SpringBoot for GraphQL
- Docker

## Docker Database

We need to stand up a Postgres database in the Docker container. The steps we have to follow are:

- docker pull postgres
- docker run -d --name graphql -p 5432:5432 -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=graphql postgres

If you need to check if the database was creating correctly, we can follow these steps:

- docker exec -it graphql bash (This command allow us to enter in the postgres container)
- sql -h localhost -U admin postgres (This command allow us to enter in server postgres, specifically inn our database graphql)
- \dt (This command list of tables that contains the graphql table)

If you need more information about the Postgres Image, you can find here (https://hub.docker.com/_/postgres).

## Properties

- spring.graphql.graphiql.enabled=true (This property allow us to enable graphiql to perform request to the backend using query language)