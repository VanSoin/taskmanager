# Task Manager API 📋

A RESTful API built with Java and Spring Boot for managing tasks.

## Tech Stack
- Java 21
- Spring Boot 3.5
- Spring Data JPA
- PostgreSQL (production database)
- Maven
- Lombok

## Project Structure
src/main/java/com/vanshika/taskmanager/
├── Task.java                      # Entity model
├── TaskRepository.java            # Database layer
├── TaskService.java               # Business logic layer
├── TaskController.java            # REST API layer
├── ResourceNotFoundException.java # Custom exception
├── GlobalExceptionHandler.java    # Global error handling
├── ErrorResponse.java             # Error response structure
└── TaskmanagerApplication.java    # Entry point

## Architecture
This project follows a layered architecture:
- Controller → handles HTTP requests and responses
- Service → business logic
- Repository → database operations
- Model → data structure
- Exception Handling → global error handling with proper HTTP status codes

## API Endpoints
| Method | Endpoint | Description | Status Codes |
|--------|----------|-------------|--------------|
| GET | /tasks | Get all tasks | 200 |
| GET | /tasks/{id} | Get task by ID | 200, 404 |
| POST | /tasks | Create a new task | 200 |
| PUT | /tasks/{id} | Update a task | 200, 404 |
| DELETE | /tasks/{id} | Delete a task | 200 |

## Error Response Format
{
    "status": 404,
    "message": "Task not found with id: 999",
    "timestamp": "2026-05-10T..."
}

## Testing with Postman
Example POST /tasks request body:
{
    "title": "Buy groceries",
    "description": "Milk, eggs, bread",
    "completed": false
}

Example PUT /tasks/1 request body:
{
    "title": "Buy groceries UPDATED",
    "description": "Milk, eggs, bread, butter",
    "completed": true
}

## How To Run Locally

### Prerequisites
- Java 21
- Maven
- PostgreSQL running locally

### Steps
1. Clone the repo
   git clone https://github.com/VanSoin/taskmanager.git

2. Create PostgreSQL database
   CREATE DATABASE taskmanager;

3. Update application.properties with your PostgreSQL password

4. Navigate to project and run
   cd taskmanager
   ./mvnw spring-boot:run (Git Bash)

5. App runs on port 8081
   http://localhost:8081/tasks

## Note
Data persists across restarts using PostgreSQL.
Previously used H2 in-memory database for development.