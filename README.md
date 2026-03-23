# HelloMaven

A simple Hello World project to introduce Java development with **Maven**, **JUnit 5 unit testing**, and **GitHub Actions** CI.

## Purpose

This project is a starting point for PROG1400 students to get familiar with:

- Structuring a Java project using Maven
- Writing and running unit tests with JUnit 5
- Automating tests with GitHub Actions on every push

## Prerequisites

- [Java 21 JDK](https://adoptium.net/)
- [Apache Maven 3.x](https://maven.apache.org/download.cgi)
- A terminal / command prompt

Verify your setup:

```bash
java -version   # should show 21.x
mvn -version    # should show 3.x
```

## Getting Started

1. **Clone the repository**

   ```bash
   git clone https://github.com/w0242502/hello-maven.git
   cd HelloMaven
   ```

2. **Compile and run**

   ```bash
   mvn compile exec:java -Dexec.mainClass="Main"
   ```

   Expected output:
   ```
   Hello, Maven!
   ```

3. **Run the unit tests**

   ```bash
   mvn test
   ```

   A passing run looks like:
   ```
   Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   BUILD SUCCESS
   ```

## Project Structure

```
HelloMaven/
├── src/
│   ├── main/java/
│   │   └── Main.java          # Application source code
│   └── test/java/
│       └── MainTest.java      # JUnit 5 unit tests
├── .github/workflows/
│   └── ci.yml                 # GitHub Actions workflow
└── pom.xml                    # Maven project configuration
```

## GitHub Actions

Every push and pull request automatically runs `mvn test` in the cloud. Check the **Actions** tab in GitHub to see results.
