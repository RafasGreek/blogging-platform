# Blogging Platform

![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-brightgreen?logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?logo=postgresql&logoColor=white)
![License](https://img.shields.io/badge/license-MIT-blue)

A RESTful blogging API built with **Java** and **Spring Boot**. This application allows users to create accounts and publish blog posts.

## Features
- Create, view, and delete user accounts
- Create, publish, view, and delete blog posts

## Technologies Used
- Java 25
- Spring Boot
- PostgreSQL
- Hibernate
- Maven
  
## Database Design
<img width="1436" height="621" alt="blogging-platform-db" src="https://github.com/user-attachments/assets/a64640b8-1930-4826-8b25-26b6d1ceab89" />

The application stores relational data using the `Users` and `Posts` tables, with a **one-to-many** relationship.
- A user can have multiple posts
- A post belongs only to one user

Because the application uses a relational database schema with foreign key relationships, **PostgreSQL** is a good choice for the database.

## How To Run The Application
1. Clone the project with `git clone {url}`
2. Configure the following environment variables:
   - DB_URL
   - DB_USER
   - DB_PASSWORD
3. Start the application with `./mvnw spring-boot:run`
4. Head to http://localhost:8080/swagger-ui/index.html to test the API

<img width="1460" height="592" alt="blogging-platform-swagger" src="https://github.com/user-attachments/assets/d4db81f8-35c5-440e-a36c-1c655ba4db55" />
