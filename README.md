# Selenium Java Automation Framework 🚀

This project is a basic automation framework built using **Selenium WebDriver**, **Java**, **TestNG**, and **Allure Reports**. It follows the Page Object Model design pattern for better maintainability and scalability.

---

## 🧰 Tech Stack

- Java 21
- Selenium 4.20.0
- TestNG 7.9.0
- Allure Reporting
- WebDriverManager
- Maven

## 🗂️ Project Structure
ecommerce-automation/
│
├── src/
│ └── test/
│ ├── java/
│ │ ├── base/ # Base classes like BaseTest
│ │ ├── pages/ # Page Object classes
│ │ ├── tests/ # Test classes
│ │ └── utils/ # Utilities like DriverFactory, Listeners
│
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md

## 🚀 How to Run Tests

```bash
mvn clean test