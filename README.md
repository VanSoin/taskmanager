# Task Manager API 📋

A RESTful API built with Java and Spring Boot for managing tasks.

## Tech Stack
- Java 21
- Spring Boot 3.5
- Spring Data JPA
- H2 Database (development)
- Maven
- Lombok

## Project Structure
src/main/java/com/vanshika/taskmanager/
├── Task.java                    # Entity model
├── TaskRepository.java          # Database layer
├── TaskService.java             # Business logic layer
├── TaskController.java          # REST API layer
└── TaskmanagerApplication.java  # Entry point

## Architecture
This project follows a layered architecture:
- Controller → handles HTTP requests and responses
- Service → business logic
- Repository → database operations
- Model → data structure

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /tasks | Get all tasks |
| POST | /tasks | Create a new task |
| PUT | /tasks/{id} | Update a task (coming soon) |
| DELETE | /tasks/{id} | Delete a task (coming soon) |

## Testing with Postman
Example POST /tasks request body:
{
    "title": "Buy groceries",
    "description": "Milk, eggs, bread",
    "completed": false
}

## How To Run Locally
1. Clone the repo
   git clone https://github.com/VanSoin/taskmanager.git

2. Navigate to project
   cd taskmanager

3. Run the app
   ./mvnw spring-boot:run (Git Bash)

4. App runs on port 8081
   http://localhost:8081/tasks

5. Access H2 database console
   http://localhost:8081/h2-console
   JDBC URL: jdbc:h2:mem:taskmanager
   Username: sa
   Password: (empty)