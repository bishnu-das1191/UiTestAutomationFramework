# Test Automation Framework

This repository contains a **Java-based Test Automation Framework** designed for efficient and scalable testing. The framework is built with modern tools and libraries to ensure robustness and maintainability, with the ability to execute tests locally and on the cloud via LambdaTest.

## Features
- **Language**: Java 21
- **Test Framework**: TestNG
- **Data-Driven Testing**: OpenCSV
- **Fake Data Creation**: Faker Library
- **Cloud Testing**: LambdaTest Integration
- **Headless Testing**: Run tests faster in headless mode
- **Command Line Execution**: Maven Surefire Plugin with configurable parameters
- **Reports and Logs**:
  - **Reports**: Generated using ExtentReports
  - **Logs**: Generated using Log4j

---

## Prerequisites

### Software Requirements
- **Java Development Kit (JDK)**: Version 21
   - Ensure `JAVA_HOME` is set correctly.
- **Maven**: Ensure Maven is installed and configured.
- **Git**: To clone this repository.

### Dependencies
All dependencies are managed via Maven and are defined in the `pom.xml` file. They include:
- Selenium
- Webdrivermanager
- TestNG
- OpenCSV
- Faker Library
- ExtentReports
- Log4j
---









## Setup Instructions

Clone the repository

```bash
  git clone https://github.com/bishnu-das1191/UiTestAutomationFramework.git

  cd UiTestAutomationFramework
```

**Running tests on LambdaTest-**

  mvn test -Dbrowser=chrome -DisLambdaTest=true -DisHeadLess=true -X 


**Running tests on chrome browser on local machine in Headless mode-**

  mvn test -Dbrowser=chrome -DisLambdaTest=false -DisHeadLess=true -X


## Reports and Logs

### Reports
- Test execution results are generated using **ExtentReports**.
- Report file: `reports.html`
- Open the HTML file in any browser to view detailed test results.

### Logs
- Logs are generated using **Log4j**.
- Log directory: `logs/`
- Check the log files for detailed debugging information.


## 🚀 About Me
Hi, My name is Bishnu Das and I have 10+ years of experience in Software testing including 8+ years of experience in automation testing using technologies like Selenium WebDriver, RestAssured, TestNG, Cucumber, ExtentReports, Jenkins.

My major expertise are with Java programming, Selenium WebDriver with JavaScript Based tools like Cypress and PlayWright.


