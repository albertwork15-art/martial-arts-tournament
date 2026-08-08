# Martial Arts Tournament Bracket Platform

A robust, full-stack application designed to manage Jiu-Jitsu and Wrestling tournaments. This platform automates the creation of tournament brackets, handles competitor registration by weight and belt level, and provides real-time updates for an engaging live event experience.

> 💡 **Nota:** Este repositorio contiene únicamente la API REST (Backend). Puedes explorar la interfaz de usuario en el **[Repositorio del Frontend (Angular) 🌐](https://github.com/albertwork15-art/martial-arts-frontend)**.
## Architecture & Tech Stack

This project is built using a modern microservices-oriented architecture, focusing on scalability, security, and a premium user experience.

### Backend (Spring Boot 3 & Java 17)
- **RESTful API**: Engineered with Spring Web and Spring Data JPA.
- **Security**: Robust authentication and authorization using Spring Security and JSON Web Tokens (JWT). Differentiated roles for `ADMIN` (bracket management) and `USER` (read-only views).
- **Real-Time Data**: Integrated Spring WebSockets to push live bracket updates to all connected clients instantly.
- **Seeding Algorithm**: Custom logic to seed brackets, preventing top-ranked competitors from facing each other in the initial rounds.
- **Audit & Monitoring**: Utilizes Spring Boot Actuator for health checks and a custom Audit Log system to track manual bracket adjustments, ensuring data integrity.
- **Document Generation**: Automated generation of official tournament brackets and diplomas using PDF libraries.

### Frontend (Angular 18)
- **Framework**: Built with Angular 18 utilizing Signals for optimal state management.
- **UI/UX Design**: Modern, dark-themed interface crafted with Tailwind CSS, featuring neon accents to highlight belt colors and essential data.
- **Dynamic Brackets**: Leverages D3.js to render complex tournament trees that visually animate as competitors advance through rounds.
- **Interactive Management**: Implements Angular Material's `CdkDrag` for intuitive, drag-and-drop bracket adjustments by administrators.
- **Admin Dashboard**: Real-time analytical dashboard using Chart.js to visualize registration statistics and academy performance.

### Infrastructure & Deployment
- **Containerization**: Fully Dockerized environment. Both the frontend and backend, along with a PostgreSQL database, are orchestrated via `docker-compose`.
- **API Documentation**: Interactive API documentation generated automatically via Swagger (OpenAPI 3.0).

## Features

- **Automated Bracket Generation**: Creates power-of-two brackets based on competitor registrations.
- **Intelligent Category Filtering**: Automatically groups competitors by Weight (Kg) and Belt Level.
- **Consolation Brackets**: Built-in support for repechage (third-place matches).
- **Academy Standings**: Real-time medal tally (Gold = 9pts, Silver = 3pts, Bronze = 1pt) to determine the best performing academies.
- **Real-Time Updates**: Spectators and competitors see live results without refreshing the page.

## Getting Started

### Prerequisites
- Docker & Docker Compose
- Node.js (for local frontend development)
- Java 17 (for local backend development)

### Running with Docker (Recommended)

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd martial-arts-tournament
   ```

2. Start the application stack:
   ```bash
   docker-compose up -d
   ```

3. Access the application:
   - **Frontend**: http://localhost:80
   - **Backend API**: http://localhost:8080
   - **Swagger UI**: http://localhost:8080/swagger-ui.html

## Future Enhancements
- Integration with external payment gateways for tournament registration fees.
- Mobile application for competitor check-ins.
