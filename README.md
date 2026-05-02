# Task Manager API 📋

A RESTful API built with Java and Spring Boot for managing tasks.

## Tech Stack
- Java 21
- Spring Boot 3.5
- Spring Data JPA
- H2 Database (development)
- Maven

## Project Structure
src/main/java/com/vanshika/taskmanager/
├── Task.java              # Entity model
├── TaskRepository.java    # Database layer
├── TaskService.java       # Business logic layer
└── TaskmanagerApplication.java  # Entry point

## How To Run Locally

1. Clone the repo
   git clone https://github.com/VanSoin/taskmanager.git

2. Navigate to project
   cd taskmanager

3. Run the app
   ./mvnw spring-boot:run

4. Access H2 console
   http://localhost:8081/h2-console
   JDBC URL: jdbc:h2:mem:taskmanager
   Username: sa
   Password: (empty)

## API Endpoints (Coming Soon)
- GET /tasks — get all tasks
- POST /tasks — create a task
- PUT /tasks/{id} — update a task
- DELETE /tasks/{id} — delete a task

## Architecture
This project follows a layered architecture:
- Controller → handles HTTP requests
- Service → business logic
- Repository → database operations