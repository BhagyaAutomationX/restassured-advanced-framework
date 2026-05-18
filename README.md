# REST Assured Advanced API Automation Framework

A scalable API Automation Framework built using REST Assured, Java, TestNG, and Maven following industry-level automation framework design practices.

This project demonstrates end-to-end API testing, reusable framework utilities, logging, listeners, retry mechanisms, request specifications, response validations, and dynamic workflow handling.

The framework is designed to simulate real-world automation testing practices used in enterprise QA environments.

---

# Tech Stack

* Java
* REST Assured
* TestNG
* Maven
* Log4j2
* Apache POI
* Git & GitHub

---

# Framework Features

✔ CRUD API Testing
✔ End-to-End API Workflow Testing
✔ Request Specification Builder
✔ Response Specification Builder
✔ Retry Failed Test Cases
✔ TestNG Listeners
✔ Logging with Log4j2
✔ Data Driven Testing using DataProvider
✔ Excel Utility Support
✔ Reusable Framework Structure
✔ Dynamic API Response Handling
✔ Clean Package Architecture
✔ Maven Build Management

---

# Project Structure

RestAssuredAdvancedFramework

├── src/test/java

│   ├── base
│   │     └── BaseTest.java

│   ├── payload
│   │     └── UserPayload.java

│   ├── tests
│   │     ├── GetUserTest.java
│   │     ├── CreateUserTest.java
│   │     ├── UpdateUserTest.java
│   │     ├── DeleteUserTest.java
│   │     └── E2EFlowTest.java

│   └── utils
│         ├── DataProviderClass.java
│         ├── Retry.java
│         ├── ListenerClass.java
│         ├── SpecBuilder.java
│         ├── ResponseSpecBuilderClass.java
│         ├── ExtentManager.java
│         └── ExcelUtils.java

├── src/test/resources
│     └── log4j2.xml

├── testng.xml

└── pom.xml

---

# APIs Covered

## GET API

* Retrieve user details
* Validate status codes and responses

## POST API

* Create new records
* Validate response payload

## PUT API

* Update existing records
* Verify updated data

## DELETE API

* Delete records
* Validate deletion responses

## End-to-End Flow

* Create → Get → Update → Delete
* Complete API lifecycle validation

---

# Key Framework Components

## Request Specification

Reusable request configuration including:

* Base URI
* Headers
* Content Type

## Response Specification

Reusable response validations:

* Status Code
* Response Assertions

## Retry Analyzer

Automatically retries failed test cases to improve execution stability.

## Listeners

Captures:

* Test Start
* Test Pass
* Test Fail
* Suite Execution Details

## Logging

Implemented using Log4j2 for better debugging and execution tracking.

---

# How To Execute The Project

## Clone Repository

[git clone https://github.com/BhagyaAutomationX/restassured-advanced-framework.git]

---

## Open Project

Import project into Eclipse as:

* Existing Maven Project

---

## Install Dependencies

Maven automatically downloads all required dependencies.

If needed:

mvn clean install

---

## Execute Test Suite

Run:

testng.xml

From:

* Eclipse TestNG Runner
* Maven
* Jenkins

---

# Sample Execution Flow

GET API TEST PASSED
POST API TEST PASSED
PUT API TEST PASSED
DELETE API TEST PASSED

E2E FLOW PASSED

Total tests run: 10
Passes: 10
Failures: 0

---

# Learning Outcomes From This Project

Through this framework implementation, the following automation concepts were practiced:

* REST Assured API Automation
* Framework Design Principles
* API Chaining
* Dynamic Response Handling
* TestNG Framework Integration
* Logging and Reporting
* Reusable Utility Development
* Data Driven Testing
* Maven Project Management
* GitHub Version Control

---

# Future Enhancements

* Jenkins CI/CD Integration
* Extent Report Integration
* Environment Configuration Support
* JSON Schema Validation
* API Authentication Handling
* Docker Execution Support
* Allure Reporting
* Parallel Execution
* Cross Environment Execution

---

# Why This Project Matters

This framework was built to simulate how automation frameworks are structured in real QA projects.

Instead of writing only basic API test scripts, the focus was placed on:

* maintainability
* scalability
* reusability
* clean framework architecture

The project reflects practical automation engineering concepts commonly used in enterprise-level testing environments.

---

# Author

## Bhagya Shastrakar

Automation Testing | API Testing | Selenium | REST Assured | Java | TestNG

Passionate about building scalable automation frameworks and continuously improving QA engineering skills.
