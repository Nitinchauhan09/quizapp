# Quiz Application

## Overview
The Quiz Application is a robust platform for creating, managing, and participating in quizzes. It features API endpoints for adding, retrieving, and categorizing questions, generating quizzes, and calculating scores. The application is built as a **monolithic architecture** using **RESTful APIs**.

## Features
- **Add Questions**: Insert questions into the database with categories.
- **Get Questions**: Retrieve questions by category or list all available questions.
- **Generate Quiz**: Create dynamic quizzes based on available questions.
- **Get Score**: Submit answers and calculate scores for completed quizzes.

## Tech Stack
- **Programming Language**: Java 17  
- **Framework**: Spring Boot  
- **Database**: PostgreSQL  
- **ORM**: Spring Data JPA  
- **Libraries**: Lombok  
- **Tools**: Postman (for API testing)  

## Endpoints
1. `POST /questions`  
   Add a new question to the database.

2. `GET /questions`  
   Retrieve all questions.

3. `GET /questions/{category}`  
   Fetch questions by category.

4. `POST /quiz/create`  
   Generate a quiz based on available questions.

5. `POST /quiz/submit/id`  
   Submit answers and calculate the score.

5. `GET /quiz/get/id`  
   Get quiz by id.

## Architecture
The application follows a **monolithic architecture** pattern, providing efficient management and deployment of all features within a single codebase.  

## Usage
1. Clone the repository.  
2. Configure PostgreSQL with the required database details.  
3. Run the application using Spring Boot.  
4. Use Postman to test the API endpoints.
