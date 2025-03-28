# Kafka Java Basics Project

[![Language: Java](https://img.shields.io/badge/language-java-blue.svg)](https://www.java.com/)
[![Build Tool: Gradle](https://img.shields.io/badge/build_tool-gradle-blue.svg)](https://gradle.org/)
[![JDK: Amazon Corretto 11](https://img.shields.io/badge/jdk-amazon_corretto_11-blue.svg)](https://aws.amazon.com/corretto/)
[![Docker: Compose](https://img.shields.io/badge/docker-compose-blue.svg)](https://docs.docker.com/compose/)

---

**Kafka Java Basics Project** is a project that demonstrates the basics of Kafka programming in Java. It includes examples of creating producers and consumers, producing data from Wikimedia changes, consuming data into OpenSearch, and using Kafka Streams to compute statistics from Wikimedia topics. This project serves as a foundation for implementing other Kafka-based applications.

---

## Installation

To get started with this project, follow these steps:

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/kafka-java-basics.git
   ```

2. Navigate to the project directory:

   ```bash
   cd kafka-java-basics
   ```

3. Install Amazon Corretto 11:

   Download and install Amazon Corretto 11 from [here](https://aws.amazon.com/corretto/). Ensure that the `JAVA_HOME` environment variable is set correctly.

4. Install Docker and Docker Compose:

   Download and install Docker from [here](https://www.docker.com/). Docker Compose is required to run the containers for Kafka, Zookeeper, and other dependencies.

5. Start the Kafka cluster:

   Navigate to the `docker-compose` directory and run:

   ```bash
   docker compose up --build --wait && echo "Conduktor started on http://localhost:8080"
   ```

---

## Usage

This project is built with Gradle. You can run the individual producer and consumer classes directly from your IDE (e.g., IntelliJ IDEA or Eclipse) or from the command line.

1. Navigate to the project root directory:

   ```bash
   cd kafka-java-basics
   ```

2. Run the desired Java class using Gradle:

   ```bash
   ./gradlew run --args='com.example.YourClassName'
   ```

   Replace `com.example.YourClassName` with the fully qualified name of the class you want to run (e.g., `com.example.WikimediaProducer`).

---

## Features

- **Basics of Kafka Java Programming**: Learn how to create producers and consumers in Java.
- **Wikimedia Producer**: Stream real-time changes from Wikimedia into Kafka topics.
- **OpenSearch Consumer**: Consume Kafka topics and index the data into OpenSearch.
- **Kafka Streams Application**: Process data from Kafka topics to compute statistics.

---