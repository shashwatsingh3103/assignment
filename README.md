Spring Boot Loading Details Management API
This Spring Boot application provides a RESTful API for managing loading details. The API allows users to create, read, update, and delete loading details.

Getting Started
Prerequisites
Java 8 or higher
Maven
PostgreSQL
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
Configure the database:

Update the application.properties file with your PostgreSQL database configuration:

properties
Copy code
# Spring Boot Application Name and Server Port
spring.application.name=projectmanager
server.port=8989

# PostgreSQL Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/projectmanager
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
spring.datasource.driver-class-name=org.postgresql.Driver

# JPA Hibernate Configuration
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build and run the application:

bash
Copy code
mvn clean install
mvn spring-boot:run
API Endpoints
Create Loading Details
URL: /load
Method: POST
Request Body:
json
Copy code
{
    "comment": "Sample comment",
    "date": "2023-06-30",
    "loadingPoint": "Point A",
    "noOfTrucks": 5,
    "productType": "Type A",
    "shipperId": "shipper123",
    "unloadingPoint": "Point B",
    "weight": 1000
}
Response:
json
Copy code
"loads details added"
Get Loading Details by Shipper ID
URL: /load
Method: GET
Query Parameter: shipperId
Response:
json
Copy code
[
    {
        "comment": "Sample comment",
        "date": "2023-06-30",
        "loadingPoint": "Point A",
        "noOfTrucks": 5,
        "productType": "Type A",
        "shipperId": "shipper123",
        "unloadingPoint": "Point B",
        "weight": 1000
    }
]
Get Loading Details by ID
URL: /load/{id}
Method: GET
Path Variable: id
Response:
json
Copy code
{
    "comment": "Sample comment",
    "date": "2023-06-30",
    "loadingPoint": "Point A",
    "noOfTrucks": 5,
    "productType": "Type A",
    "shipperId": "shipper123",
    "unloadingPoint": "Point B",
    "weight": 1000
}
Update Loading Details by ID
URL: /load/{id}
Method: PUT
Path Variable: id
Request Body:
json
Copy code
{
    "comment": "Updated comment",
    "date": "2023-07-01",
    "loadingPoint": "Point C",
    "noOfTrucks": 10,
    "productType": "Type B",
    "shipperId": "shipper456",
    "unloadingPoint": "Point D",
    "weight": 2000
}
Response:
json
Copy code
"loads details updated"
Delete Loading Details by ID
URL: /load/{id}
Method: DELETE
Path Variable: id
Response:
json
Copy code
"loads details deleted"
