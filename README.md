✈️ BlazeDemo Automation Framework

A scalable Selenium automation framework built using Java, TestNG, and Maven to automate the end-to-end flight booking workflow of BlazeDemo.

🔗 Application Under Test: https://blazedemo.com

🚀 Tech Stack

Java 21

Selenium WebDriver 4

TestNG

Maven

WebDriverManager

🏗 Framework Architecture

Page Object Model (POM)

Reusable Base Test Class

Explicit Wait Implementation

TestNG Groups (Smoke, Functional, Negative)

Data-Driven Testing using @DataProvider

Maven-based dependency management

📂 Project Structure
src/test/java
 ├── pages        → Page Object classes
 ├── tests        → Test classes
 └── utils        → Base setup & utilities

pom.xml           → Dependencies
testng.xml        → Suite execution

✅ Test Coverage

Homepage validation (Smoke)

Flight search & booking (Functional)

Multiple user data sets (Data-Driven)

Negative scenarios (invalid/blank card validation)

▶️ Execution

Run via:

mvn clean test


OR

Right-click testng.xml → Run as TestNG Suite

🔥 Highlights

✔ Modular & maintainable design
✔ Industry-standard folder structure
✔ Ready for CI/CD integration
✔ Easily extendable for reporting & parallel execution

👨‍💻 Author

Hrithik Rudra
Automation Engineer | Java & Selenium
