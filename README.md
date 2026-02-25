# 📱 Mobile Automation Framework (Appium + Java + Maven)

This project is a **sample production-style mobile automation framework** using:

- ✅ Appium (Android automation)
- ✅ Java + Maven
- ✅ Page Object Model (POM)
- ✅ Allure Reporting
- ✅ MockWebServer (API mocking)
- ✅ JUnit

---

# 🚀 Project Structure
mobile-automation/
 ├── src/test/java
 │    ├── base
 │    │     └── BaseTest.java
 │    ├── pages
 │    │     └── LoginPage.java
 │    ├── tests
 │    │     └── LoginTest.java
 │    └── utils
 │          └── DriverManager.java
 └── pom.xml

---

# ⚙️ Prerequisites

Install the following:

- Java 11+
- Maven
- Node.js
- Appium Server
- Android Studio + Emulator
- Allure CLI

---

# ▶️ Running Tests

## 1️⃣ Start Appium
appium

## 2️⃣ Run Maven Tests
mvn clean test

---

# 📊 Allure Reporting

## Generate results
mvn clean test

## Serve report
allure serve allure-results

---

# 🤖 Appium Capabilities (Sample)
platformName = Android  
deviceName = Android Emulator  
automationName = UiAutomator2  
appPackage = com.example.cipra  
appActivity = .LoginPage  

---

# 🧪 MockWebServer Usage
- Simulates backend APIs
- Enables offline API testing
- Ensures deterministic automation

---

# ⭐ Best Practices
- Use Page Object Model
- Avoid Thread.sleep → use waits
- Run tests on CI/CD
- Enable parallel execution
- Store locators centrally

---

# 🔮 Future Improvements
- TestNG integration
- Parallel execution
- CI/CD pipeline
- Device farm execution
- Screenshot & video capture
- API + UI hybrid testing

---

# 👨‍💻 Author
QA Automation Framework Sample
