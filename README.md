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
