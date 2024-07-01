# Spring Boot Loading Details Management API
This Spring Boot application provides a RESTful API for managing loading details. The API allows users to create, read, update, and delete loading details.

#**Getting Started**
Prerequisites
Java 8 or higher
Maven
PostgreSQL
Installation
Clone the repository:

bash

git clone https://github.com/shashwatsingh3103/assignment.git
cd assignment
Configure the database:

# **Update the application.properties file with your PostgreSQL database configuration:**
properties
Copy code
 Spring Boot Application Name and Server Port
spring.application.name=projectmanager
server.port=8989

# ** PostgreSQL Database Configuration**
spring.datasource.url=jdbc:postgresql://localhost:5432/projectmanager
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
spring.datasource.driver-class-name=org.postgresql.Driver

# **JPA Hibernate Configuration**
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build and run the application:



