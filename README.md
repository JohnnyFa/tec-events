
# Event Management API - eventostec.com.br

This project is an open-source backend system for managing events, built from scratch with Java Spring Boot and PostgreSQL. The application is deployed to AWS, utilizing services like EC2, RDS, VPC, S3, and more.

## Table of Contents
- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Endpoints](#endpoints)
- [AWS Deployment](#aws-deployment)
- [Running the Application](#running-the-application)
- [Future Improvements](#future-improvements)

## Overview

This project is part of the open-source platform [eventostec.com.br](https://eventostec.com.br), designed for creating, managing, and participating in tech events. The backend API is developed using **Java 21**, **Spring Boot 3**, and **PostgreSQL**, with deployment on **AWS** using services like EC2 for compute, RDS for database management, VPC for network control, S3 for storage, and other AWS tools.

### Key Features:
- Event creation, updates, and deletion
- User registration for events
- Handling event categories and locations
- Integration with AWS services for storage and scalability

## Technologies Used
- **Java 21**: Modern Java features for backend logic.
- **Spring Boot 3**: Framework for building the API.
- **PostgreSQL**: For database management.
- **Maven**: Build automation and dependency management.
- **AWS EC2**: For hosting the backend.
- **AWS RDS**: Managed PostgreSQL instance for data storage.
- **AWS S3**: For storing event-related assets like images.
- **AWS VPC**: For networking and security management.

## Project Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.eventostec
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       ├── service
│   │   ├── resources
│   │       └── application.properties
│   └── test
│       └── java
├── pom.xml
└── README.md
```

- **Controller:** Handles HTTP requests related to event management.
- **Model:** Represents entities like `Event`, `User`, `Category`.
- **Repository:** Interfaces for database access, typically using Spring Data JPA.
- **Service:** Contains the business logic.

## Setup and Installation

### Prerequisites:
- **Java 21** or later
- **Maven 3.8+**
- **PostgreSQL**: Ensure PostgreSQL is installed and running.
- **AWS Account**: For deployment.

### Steps to Run:
1. **Clone the repository:**
   ```bash
   git clone https://github.com/JohnnyFa/event-management-api.git
   cd event-management-api
   ```

2. **Configure PostgreSQL**:
   Update the `application.properties` file with your PostgreSQL database settings:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/eventdb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**: The application will run on `http://localhost:8080`.

## Endpoints

| Method | Endpoint       | Description                       |
|--------|----------------|-----------------------------------|
| GET    | `/events`      | Retrieve a list of events         |
| POST   | `/events`      | Create a new event                |
| GET    | `/events/{id}` | Retrieve event details by ID      |
| PUT    | `/events/{id}` | Update an existing event          |
| DELETE | `/events/{id}` | Delete an event                   |

## AWS Deployment

### Steps to Deploy:
1. **EC2 Instance**: Launch an EC2 instance and configure security groups to allow access.
2. **RDS (PostgreSQL)**: Create an RDS instance for the PostgreSQL database.
3. **VPC**: Ensure your EC2 and RDS are in the same VPC for communication.
4. **S3 (Optional)**: Create an S3 bucket for storing event-related media (images, files).
5. **Deploy Application**: Upload the built JAR file to your EC2 instance and run it.

### Configuration
Ensure that your `application.properties` file is updated with the RDS database credentials and S3 bucket configurations.

## Running the Application

Once the application is running, you can interact with the API via:
- **Postman** or **Curl**: For testing API requests.

### Example Curl Command:
```bash
curl -X GET http://localhost:8080/events
```

## Future Improvements
- **User Authentication**: Integrate Spring Security for user authentication.
- **API Documentation**: Add Swagger for API documentation and testing.
- **Event Analytics**: Add real-time analytics for event participation.
- **AWS Lambda**: Use AWS Lambda for serverless event processing.
