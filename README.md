# Martial Arts Tournament Bracket Platform (Backend)

A robust Spring Boot REST API designed to manage Jiu-Jitsu and Wrestling tournaments. This backend handles competitor data, seed logic, and provides endpoints for the Angular frontend.

> 💡 **Nota:** Este repositorio contiene únicamente la API REST (Backend). Puedes explorar la interfaz de usuario en el **[Repositorio del Frontend (Angular) 🌐](https://github.com/albertwork15-art/martial-arts-frontend)**.

## Architecture & Tech Stack

### Backend (Spring Boot 3 & Java 17)
- **RESTful API**: Engineered with Spring Web and Spring Data JPA.
- **Database**: H2 in-memory database for rapid development and testing (can be easily switched to PostgreSQL).
- **Security**: Basic CORS configuration to allow local frontend connectivity. Prepared for JWT integration.
- **Data Initialization**: Seeds the database automatically with dummy competitors (Gracie Barra, Alliance, etc.) upon startup.

## Features

- **Competitor Management**: Endpoints to fetch and register competitors.
- **Intelligent Category Data**: Exposes data grouped by Weight (Kg) and Belt Level for frontend consumption.
- **CORS Enabled**: Ready to be consumed by `http://localhost:4200`.

## Getting Started

### Prerequisites
- Java 17
- Maven (Wrapper included)

### Local Development

1. Clone the repository:
   ```bash
   git clone https://github.com/albertwork15-art/martial-arts-tournament.git
   cd martial-arts-tournament
   ```

2. Start the application:
   ```bash
   ./mvnw spring-boot:run
   ```
   *(Or run `DemoApplication.java` from your IDE)*

3. Access the API and Database:
   - **API Endpoint**: `http://localhost:8080/api/competitors`
   - **H2 Console**: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:tournamentdb`, User: `sa`, Pass: `password`)

## Future Enhancements
- Integration with PostgreSQL.
- Spring Security with JWT token authentication.
- WebSockets for real-time bracket updates.
