# 🏨 Hotel Rating Microservices Project

A **Spring Boot Microservices** application where users can rate and review hotels.  
This project demonstrates modern microservice architecture with **service discovery, API Gateway, inter-service communication, security, and fault tolerance**.

---

## 🚀 Architecture Overview

The system is designed as a set of loosely coupled microservices:

- **Hotel Service** – Manages hotel information (name, location, details).
- **Rating Service** – Manages user ratings & reviews for hotels.
- **User Service** – Handles user details.
- **API Gateway** – Central entry point for routing requests to services.
- **Service Discovery (Eureka)** – Registers and discovers all microservices.
- **Security Service** – Authentication & Authorization using **Okta + Spring Security**.

---

## 🛠️ Tech Stack

- **Core:** Java 17, Spring Boot, Spring Cloud, Spring WebFlux  
- **Microservices:** Eureka Discovery, API Gateway, Feign Client, RestTemplate  
- **Database:** MySQL (for Hotel and Rating services)  
- **Messaging & Communication:** Feign Client + RestTemplate for inter-service communication  
- **Security:** Okta OAuth2, Spring Security (JWT-based authentication & authorization)  
- **Resilience & Fault Tolerance:** Resilience4j (circuit breaker, retry, rate limiting)  
- **Design Patterns:** REST API design, DTO, Service Layer, Factory, Singleton  

---

## 🔑 Features

- ➕ **Add & Manage Hotels** – Create and manage hotel information.  
- ⭐ **Provide Ratings** – Users can give ratings & reviews to hotels.  
- 🔗 **Service Discovery** – All services register with **Eureka Server** for dynamic lookup.  
- 🌐 **API Gateway** – Unified entry point for external clients.  
- 🔒 **Secure Access** – Authentication & Authorization with **Okta**.  
- ⚡ **Resilience** – Fault-tolerant service calls with **Resilience4j**.  
- 📡 **Inter-Service Communication** – Using both **Feign Client** and **RestTemplate**.  
- 🧩 **Reactive Programming** – Integration of **Spring WebFlux** for non-blocking APIs.  

---

## 📂 Project Structure
Hotel-Rating-SpringBoot-Microservice
│── api-gateway/ # Spring Cloud Gateway + Okta OAuth2 + Spring Security
│── Service-discovery/ # Eureka Server
│── hotel-service/ # Manages hotel data
│── rating-service/ # Manages user ratings
│── User-service/ # Manages Users
│── Config-Server/ # manages common configuration 


---

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+
- MySQL running locally
- Okta Developer Account (for OAuth2 credentials)

### Steps
1. Clone the repo:
   ```bash
   git clone https://github.com/hpradeep26/Hotel-Rating-SpringBoot-Microservice.git
2. Configure MySQL in application.yml of Hotel and Rating services.
3. Update Okta credentials in application.yml for the Security Service.
4. Run Discovery Service (Eureka).
5. Run API Gateway.
5. Run individual microservices (hotel-service, rating-service, etc.).
6. Access APIs through the API Gateway (default: http://localhost:8064).

🎯 Learning Outcomes
Hands-on with Spring Cloud microservices.
Integration of Okta Security with Spring Boot.
Fault tolerance using Resilience4j.
Service-to-service communication with Feign Client & RestTemplate.
Secure and scalable architecture for real-world applications.

Contributions are welcome! Please open issues or submit pull requests for improvements.

