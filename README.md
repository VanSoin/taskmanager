# Task Manager API 📋

A RESTful API built with Java and Spring Boot for managing tasks.

## Tech Stack
- Java 21
- Spring Boot 3.5
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Spring Validation

## Project Structure
src/main/java/com/vanshika/taskmanager/
├── Task.java                      # Entity model with validation
├── TaskRepository.java            # Database layer
├── TaskService.java               # Business logic layer
├── TaskController.java            # REST API layer
├── ResourceNotFoundException.java # Custom 404 exception
├── GlobalExceptionHandler.java    # Global error handling
├── ErrorResponse.java             # Error response structure
└── TaskmanagerApplication.java    # Entry point

## Architecture
This project follows a layered architecture:
- Controller → handles HTTP requests, triggers validation
- Service → business logic
- Repository → database operations
- Model → data structure with validation constraints
- Exception Handling → global error handling with proper HTTP status codes

## API Endpoints
| Method | Endpoint | Description | Status Codes |
|--------|----------|-------------|--------------|
| GET | /tasks | Get all tasks | 200 |
| GET | /tasks/{id} | Get task by ID | 200, 404 |
| POST | /tasks | Create a new task | 200, 400, 404 |
| PUT | /tasks/{id} | Update a task | 200, 400, 404 |
| DELETE | /tasks/{id} | Delete a task | 200 |

## Validation Rules
- Title: required, 2-100 characters
- Description: optional, max 500 characters

## Error Response Format
All errors return consistent JSON:
{
    "status": 404,
    "message": "Task not found with id: 999",
    "timestamp": "2026-05-10T..."
}

## Testing with Postman

POST /tasks — valid request:
{
    "title": "Buy groceries",
    "description": "Milk, eggs, bread",
    "completed": false
}

POST /tasks — invalid request (returns 400):
{
    "title": "",
    "description": "test",
    "completed": false
}

PUT /tasks/1:
{
    "title": "Updated title",
    "description": "Updated description",
    "completed": true
}

## How To Run Locally

Prerequisites:
- Java 21
- Maven
- PostgreSQL running locally

Steps:
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

## Coming Soon
- JWT Authentication
- Docker containerization
- AWS EC2 deployment
- GitHub Actions CI/CD