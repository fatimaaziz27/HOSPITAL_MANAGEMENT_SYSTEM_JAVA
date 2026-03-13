# Hospital Management System (Java)

A simple **Console-Based Hospital Management System** built in **Java**.
This project allows users to **add patient details, display patient information, and update emergency status** using a menu-driven program.

This project is designed for **beginners learning Java, OOP concepts, and collections like HashMap**.

---

## Features

* Add new patient details
* Display patient information using **Patient ID**
* Change patient's **emergency status**
* Menu-driven program that runs until the user exits

---

## Patient Information Stored

Each patient record contains:

* Patient ID
* Patient Name
* Patient Age
* Patient Disease
* Emergency Status (Yes / No)

---

## Menu Example

```text
1. Add Patient
2. Display Info
3. Change Patient Emergency
```

---

## Example Output

### Add Patient

```text
Select an option: 1
Enter patient id: 1
Enter patient name: Ali
Enter patient age: 30
Enter patient disease: Fever
Emergency? (yes/no): yes
```

### Display Patient Info

```text
Select an option: 2
Enter patient ID: 1

Patient Info:
Name: Ali
Age: 30
Disease: Fever
Emergency Status: yes
```

### Change Emergency Status

```text
Select an option: 3
Enter patient ID: 1
Emergency status updated
```

---

## Concepts Used

This project demonstrates the use of:

* **Java Classes and Objects**
* **HashMap Collection**
* **User Input using Scanner**
* **Conditional Statements**
* **Menu Driven Programs**
* **Basic Data Management**

---

## Data Structure Used

The program uses **HashMap** to store patient details.

```java
HashMap<Integer, String> patient_names
HashMap<Integer, Integer> patient_age
HashMap<Integer, String> patient_disease
HashMap<Integer, String> patient_emergency_status
```

* **Key → Patient ID**
* **Value → Patient Details**

This allows **fast search and retrieval of patient records**.

---

## How to Run

1. Install **Java JDK**
2. Clone the repository

```bash
git clone https://github.com/your-username/hospital-management-system-java.git
```

3. Compile the program

```bash
javac JAVA.java
```

4. Run the program

```bash
java JAVA
```

---

## Project Structure

```text
JAVA.java
│
├── JAVA (Main Class)
│
└── hospital
    ├── add_patient()
    ├── display_info()
    └── chg_patients_emg()
```

---

## Purpose

The purpose of this project is to help beginners **practice Java programming, collections, and simple management systems**.

---

## Author

**Fatima Aziz**

---

⭐ If you found this project helpful, consider giving the repository a **star on GitHub**.
