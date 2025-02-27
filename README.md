# Luma Account Creation and Sign-In Automation Testing

This project automates the testing of **Account Creation** and **Sign-In** functionalities on the **Luma** e-commerce website using **Selenium WebDriver**, **Cucumber**, and **TestNG**.

---

## **Project Overview**
The automation suite covers the following scenarios:
- Account creation with valid data
- Sign-in with the created account
- Verification of successful account creation and login

---

##**Tech Stack**
- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Testing Framework:** Cucumber with Gherkin syntax
- **Build Tool:** Maven
- **Test Management:** TestNG
- **Reporting:** Cucumber HTML Reports

---

##**Project Structure**
```
LumaAutomationProject/
├── src/test/java/
│   ├── stepDefinitions/       # Cucumber step definitions
│   ├── runners/               # Test runner class
│   ├── pages/                 # Page Object Model classes
│   └── utils/                 # Utility classes (e.g., WebDriver setup)
├── src/test/resources/
│   ├── features/              # Feature files
│   └── config.properties      # Configuration files
├── pom.xml                    # Maven dependencies
└── README.md                  # Project documentation
```

---

##**Setup Instructions**
### **Prerequisites:**
- Java 
- Maven
- IDE ( Eclipse)
- ChromeDriver

### **Installation Steps:**
1. **Clone the repository:**
```bash
git clone https://github.com/Archana3117/IncuByte_Assessment_Automation_SignUpFlow.git
```

2. **Install Dependencies:**
```bash
mvn clean install
```


##**Execution**
### **Run Tests Using Maven:**

mvn test
```

---

##**Reports**
- After test execution, HTML reports will be generated in the **target/cucumber-reports** directory.



