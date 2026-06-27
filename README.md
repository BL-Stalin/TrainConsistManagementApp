# 🚆 Train Consist Management Application

A robust, Java-based enterprise-grade system designed to manage and optimize train configurations (consists). The application demonstrates the practical application of core Java fundamentals, data structures, algorithms, exception handling, and regular expressions, structured incrementally across 20 distinct use cases.

---

## 📋 Table of Contents
- [Project Overview](#-project-overview)
- [Key Features & Use Cases](#-key-features--use-cases)
- [Architecture & Directory Structure](#-architecture--directory-structure)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
- [Development Timeline & Best Practices](#-development-timeline--best-practices)

---

## 🔍 Project Overview

In railway operations, a **consist** is the group of rail vehicles (locomotives and bogies) made up to form a train. This application serves as a backend management tool to dynamically build, validate, search, and sort different types of bogies (Passenger, Goods/Cargo) while ensuring safety compliance and optimized performance.

---

## 🚀 Key Features & Use Cases

The development of the application is divided into 20 incremental Use Cases (UC), covering everything from collection structures to advanced stream filtering and search algorithms.

### 🛠️ Use Case Roadmap

| Phase / Module | Use Case | Description | Technology/Pattern |
| :--- | :--- | :--- | :--- |
| **1. Basic Consist & Collections** | **UC1** | Initialize Train & Display Consist Summary | Basic OOP, Lists |
| | **UC2** | Add Passenger Bogies to Train | `ArrayList` Operations |
| | **UC3** | Track Unique Bogie IDs | `HashSet` |
| | **UC4** | Maintain Ordered Bogie IDs | `LinkedList` |
| | **UC5** | Preserve Insertion Order of Bogies | `LinkedHashSet` |
| **2. Mapping & Advanced Streams** | **UC6** | Map Bogie to Capacity | `HashMap` |
| | **UC7** | Sort Bogies by Capacity | Custom `Comparator` |
| | **UC8** | Filter Passenger Bogies | Java Streams & Lambda |
| | **UC9** | Group Bogies by Type | `Collectors.groupingBy` |
| | **UC10** | Count Total Seats in Train | Stream `.reduce()` |
| **3. Safety, Validation & Exceptions**| **UC11** | Validate Train ID & Cargo Codes | Regular Expressions (Regex) |
| | **UC12** | Safety Compliance Check for Goods Bogies | Policy Validation Rules |
| | **UC13** | Performance Benchmark (Loops vs Streams) | Benchmarking Metrics |
| | **UC14** | Handle Invalid Bogie Capacity | Custom `InvalidCapacityException` |
| | **UC15** | Safe Cargo Assignment | `try-catch-finally` |
| **4. Algorithms & Searching** | **UC16** | Sort Passenger Bogies by Capacity | Custom Bubble Sort |
| | **UC17** | Sort Bogie Names | `Arrays.sort()` |
| | **UC18** | Linear Search for Bogie ID | Array-Based Linear Search |
| | **UC19** | Binary Search for Bogie ID | Optimized Binary Search |
| | **UC20** | Exception Handling in Search Operations | Robust Fail-Safe Search |

---

## 📁 Architecture & Directory Structure

The project follows a clean, layered architecture adhering strictly to SOLID design principles:

```filepath
TrainConsistManagement/
└── src/
    └── main/
        ├── TrainConsistManagementApp.java         # Main entry point & runner
        ├── exception/
        │   ├── CargoSafetyException.java          # Runtime exception for cargo safety violations
        │   └── InvalidCapacityException.java      # Checked exception for invalid capacities
        ├── model/
        │   ├── Bogie.java                         # Base model representing a generic Bogie
        │   ├── GoodsBogie.java                    # Model for Cargo/Goods bogie configurations
        │   └── PassengerBogie.java                # Model for Passenger bogie configurations
        └── service/
            └── CargoAssignmentService.java        # Business logic for safe cargo handling
```

---

## 💻 Tech Stack

- **Language:** Java 17+ (Features used: Streams, lambdas, custom exceptions, custom comparators)
- **Build/Packaging:** Standard Java Directory Layout
- **Version Control:** Git with clean, semantic commit history following industry standards

---

## ⚡ Getting Started

### Prerequisites
Make sure you have JDK 17 (or newer) installed and configured in your environment path.

### Compilation
Navigate to the root source directory and compile all Java classes:
```bash
cd TrainConsistManagement/src
javac main/TrainConsistManagementApp.java main/model/*.java main/exception/*.java main/service/*.java
```

### Run the App
Run the main entry class:
```bash
java main.TrainConsistManagementApp
```

---

## 📅 Development Timeline & Best Practices

This project was built over a structured 4-day sprint from **June 24, 2026** to **June 27, 2026**.

### 🌟 Git Best Practices Implemented:
- **Sole Contributor:** All commits are cleanly attributed to one unified identity (`Stalin`).
- **Semantic Branching:** Each feature branch represents exactly one Use Case (`feature/UCX-description`).
- **Standardized Commit Messages:** Messages follow the format: `[Stalin] Added : UCX - Description of the implemented functionality`.
- **Merge/PR Workflow:** Every feature branch was integrated into `dev` via formal, clean pull requests.