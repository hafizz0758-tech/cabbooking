# 🚕 Cab Booking System

A backend-based Cab Booking System developed using **Java, Spring Boot, Spring Data JPA, Spring Security, REST API, and MySQL**.

## 📌 Project Overview

The Cab Booking System allows passengers to request rides, admins to assign drivers, and drivers to manage the ride status.

The project follows a layered architecture:

**Controller → Service → Repository → Database**

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Spring Security
* REST API
* MySQL
* Maven
* Postman
* Eclipse / VS Code
* Git & GitHub

## 👥 User Roles

### 👤 Passenger

* Request a cab
* Provide pickup location
* Provide drop location
* View ride details

### 🚗 Driver

* Start a ride
* Complete a ride

### 👨‍💼 Admin

* Assign a driver to a ride

## 🔄 Ride Flow

```text
Passenger
    ↓
Request Ride
    ↓
REQUESTED
    ↓
Admin Assigns Driver
    ↓
ACCEPTED
    ↓
Driver Starts Ride
    ↓
STARTED
    ↓
Driver Completes Ride
    ↓
COMPLETED
```

## 🔐 Security

Spring Security is used for authentication and role-based authorization.

Different roles are provided for:

* ADMIN
* PASSENGER
* DRIVER

HTTP Basic Authentication is used for securing the APIs.

## 🗄️ Database

MySQL is used as the database.

Main entities:

* User
* Vehicle
* Ride

### User

Stores:

* ID
* Name
* Email
* Password
* Role

### Vehicle

Stores:

* ID
* Vehicle Number
* Vehicle Type

### Ride

Stores:

* ID
* Pickup Location
* Drop Location
* Passenger
* Driver
* Ride Status
* Fare

## 🔗 API Endpoints

### User Registration

```http
POST /register
```

### Vehicle Registration

```http
POST /registervehicle
```

### Passenger - Request Ride

```http
POST /passenger/ride/{passengerid}
```

### Admin - Assign Driver

```http
PUT /admin/assign/{rideid}/{driverid}
```

### Driver - Start Ride

```http
PUT /driver/started/{rideid}
```

### Driver - Complete Ride

```http
PUT /driver/completed/{rideid}
```

## 💰 Fare

The current implementation uses a fixed fare of **100** for a ride.

## 📂 Project Structure

```text
src
└── main
    └── java
        └── com.example.cabbooking
            ├── config
            │   ├── SecurityConfig
            │   └── CustomUserDetailsService
            │
            ├── controller
            │   ├── UserController
            │   ├── VehicleController
            │   ├── PassengerController
            │   ├── DriverController
            │   └── AdminController
            │
            ├── service
            │   ├── UserService
            │   ├── VehicleService
            │   └── RideService
            │
            ├── dao
            │   ├── UserRepo
            │   ├── VehicleRepo
            │   └── RideRepo
            │
            └── model
                ├── User
                ├── Vehicle
                ├── Ride
                ├── RideRequest
                ├── Role
                └── RideStatus
```

## ▶️ How to Run

1. Clone the repository.
2. Open the project in Eclipse or VS Code.
3. Configure MySQL database.
4. Update the database configuration in `application.properties`.
5. Run the Spring Boot application.
6. Test the REST APIs using Postman.

## 🧪 API Testing

Postman is used to test the REST APIs.

Example ride request:

```json
{
    "pickuplocation": "Chennai",
    "droplocation": "Velachery"
}
```

## 🎯 Learning Outcomes

Through this project, I worked with:

* Spring Boot REST APIs
* Spring Data JPA
* Entity relationships
* MySQL database integration
* Spring Security
* Role-based authorization
* Service and repository layers
* API testing using Postman
* Git and GitHub

## 👨‍💻 Author

**Arikaran Marimuthu**

GitHub: [(https://github.com/hafizz0758-tech/cabbooking.git)]
