# 🚀 Spring Boot CRUD Application

This is a simple **Spring Boot REST API** project that performs basic CRUD operations (Create, Read, Update, Delete) using:

* Spring Boot
* Spring Data JPA
* H2 Database (In-Memory)
* REST APIs

---

## 📌 Features

✅ Add User
✅ Get All Users
✅ Update User
✅ Delete User
✅ Embedded Tomcat Server
✅ H2 Database Console

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

---

## 📂 Project Structure

```
src/main/java/com/springboot_project/springboot
│
├── controller
│   └── UserController.java
│
├── model
│   └── User.java
│
├── repository
│   └── UserRepository.java
│
└── SpringbootApplication.java
```

---

## ⚙️ Configuration

`application.properties`

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

server.port=8081
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/springboot.git
```

2. Open project in IDE (IntelliJ / Eclipse)

3. Run:

```
SpringbootApplication.java
```

4. Open browser:

```
http://localhost:8081
```

---

## 🔗 API Endpoints

### ➕ Add User

**POST** `/add`

Body:

```
{
  "name": "Kirti",
  "email": "kirti@gmail.com"
}
```

---

### 📥 Get All Users

**GET** `/users`

---

### ✏️ Update User

**PUT** `/users/{id}`

Body:

```
{
  "name": "Updated Name",
  "email": "updated@gmail.com"
}
```

---

### ❌ Delete User

**DELETE** `/delete/{id}`

---

## 🗄️ H2 Database Console

Open:

```
http://localhost:8081/h2-console
```

Use:

```
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (leave empty)
```

---

## 💡 Key Concepts Used

* REST API Development
* Dependency Injection (@Autowired)
* JPA Repository
* Entity Mapping
* HTTP Methods (GET, POST, PUT, DELETE)

---

## 🎯 Future Improvements

* Add Service Layer (Clean Architecture)
* Use MySQL instead of H2
* Add Validation
* Add Exception Handling
* Add Swagger Documentation

---

## 👩‍💻 Author

**Kirti**

---
