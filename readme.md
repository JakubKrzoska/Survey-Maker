# Define the content for the Survey Maker README.md
survey_maker_readme = """# 🗳️ Survey Maker - Full Stack Application

[![Angular](https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white)](https://angular.io/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)](https://getbootstrap.com/)

> A dynamic polling application that allows users to create surveys and participate in voting, powered by a robust Spring Boot backend and an interactive Angular frontend.

## 📝 Project Description
**Survey Maker** is a full-stack project designed to manage real-time polls. It features a responsive UI built with **Bootstrap** and a scalable backend architecture using **Spring Data JPA** for database persistence. This project demonstrates the flow of data from a relational database (MySQL) through a RESTful service to a modern frontend application.

The project is structured as follows:
* **`poll-app`**: The Angular frontend for user interaction and poll management.
* **`voting-app`**: The Spring Boot backend handling logic, data, and security.

## ✨ Key Features
* **Interactive Polling:** Create and participate in surveys with immediate feedback.
* **Data Persistence:** Integrated with **MySQL** via **Spring Data JPA** for reliable storage.
* **Simplified Coding:** Utilized **Lombok** to reduce boilerplate code in Java models.
* **Responsive Design:** Styled with **Bootstrap** to ensure usability across all devices.

## 📷 Screenshots
<img width="1899" height="916" alt="pollpage" src="https://github.com/user-attachments/assets/16445bb6-7b01-4ec4-9524-cdc91752ad83" />

## 🛠️ Technologies Used
### Frontend (`poll-app`)
* **Framework:** Angular
* **Styling:** Bootstrap 5
* **Communication:** Angular HttpClient

### Backend (`voting-app`)
* **Framework:** Spring Boot
* **Language:** Java
* **ORM:** Spring Data JPA / Hibernate
* **Database:** MySQL
* **Tools:** Lombok, Maven

## 🧠 What I Learned
* **Full-Stack Integration:** Connecting an Angular frontend to a Spring Boot REST API with a live MySQL database.
* **JPA & Hibernate:** Managing relational data mapping and performing CRUD operations through repositories.
* **Lombok Efficiency:** Using annotations to automatically generate getters, setters, and constructors.
* **Component Styling:** Integrating Bootstrap components within the Angular framework for rapid UI development.

## 🚀 How to Run Locally

### Prerequisites
* MySQL Server running with a database created (e.g., `survey_db`).
* Update `src/main/resources/application.properties` in `voting-app` with your MySQL credentials.

### 1. Backend (Java Spring Boot)
1. Navigate to `voting-app`.
2. Run the application:
   ```bash
   mvn spring-boot:run

### 2. Frontend (Angular)
1.  Navigate to `/poll-app`.
2.  Install dependencies: `npm install`.
3.  Start the dev server: `ng serve`.
4.  Open `http://localhost:4200` in your browser.
