# TeleCom Service Manager 📱

A Java-based console application that simulates a management system for a mobile telecommunications provider. This project was developed as part of the "Computer Programming in Java" course at Athens University of Economics and Business (AUEB).

## 📖 Overview

The application manages two main categories of communication services:
1.  **Mobile Telephony** (Contract & Prepaid/Card-Contract)
2.  **Mobile Internet**

It allows the user (administrator) to view available services, sign up new clients (create contracts), update usage statistics (minutes, SMS, data), and calculate monthly bills based on specific plan rates and discounts.

## ✨ Features

* **Service Management:** Predefined list of available plans (Contract, Prepaid, Internet).
* **Contract Creation:** Register new customers with personal details and assign them to a service.
* **Usage Simulation:** Update usage statistics for active contracts (e.g., Minutes talked, SMS sent, Data consumed).
* **Billing Engine:**
    * Calculates total monthly costs including fixed fees (`pagio`) and extra charges.
    * Applies specific logic for Prepaid contracts (deducting from balance).
    * Applies discounts based on service type.
* **Statistics View:** Check remaining free minutes, SMS, or Data for any client.

## 🏗️ Class Architecture

The project utilizes Object-Oriented Programming principles, specifically **Inheritance** and **Polymorphism**.

### Service Hierarchy
* **`Service`** (Base Class): Contains common attributes like name and fixed fee.
    * **`symvolaio_kin`**: Standard mobile contract (Free Minutes, SMS, extra rates).
    * **`Kartosymvolaio`**: Prepaid contract (Includes balance/`ypoloipo` logic).
    * **`Internet`**: Mobile data plans (Data allowance, rate per MB).

### Contract Management
* **`Symvolaia`**: Represents an active customer contract. Links a customer to a service and holds usage stats.
* **Collections**:
    * `ServiceCollection`: Manages the list of offered services.
    * `SymvolaiaCollection`: Manages the database of active customer contracts.

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher.

### Compilation
Navigate to the project directory and compile all java files:

    javac *.java

### Execution
Run the main application:

    java mainApp

## 🕹️ Usage (Menu)

Upon running the app, you will be presented with the following menu:

1.  **See Services:** List all available plans (Contract, Card-Contract, Internet).
2.  **Create a new contract:** Register a new user to a plan.
3.  **View active contracts:** Filter and show contracts by service type.
4.  **Update statistics:** Select a contract ID and input used Minutes/SMS/Data.
5.  **Calculation of the total monthly cost:** Prints the final bill for all clients (including extra charges).
6.  **Current client stats:** Shows remaining balance, free minutes, and data.
0.  **Exit:** Close the application.

## 👥 Contributors

* **Gewrgios Vlasshs**
* **Thomas Vasilas**
* **Iwanna Zaxarakh**

---
*Disclaimer: This project uses Greek terminology (Greeklish) for variable names and specific business logic as per the assignment requirements.*
