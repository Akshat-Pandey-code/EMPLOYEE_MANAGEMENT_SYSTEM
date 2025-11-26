#  Employee Management System

A simple **Employee Management System** built using **Core Java**, demonstrating:

1. Object-Oriented Programming (OOP)
2. CRUD Operations (Create, Read, Update, Delete)
3. Collections Framework (`ArrayList`)
4. Searching & Sorting
5. Menu-driven User Interface
6. Comparator usage
7. Input handling using Scanner
8. Save to File

---

## Features

### 1️. Add Employee

* Enter ID, Name, Salary
* Employee is added to the list
* Automatically **sorted by ID** after insertion

### 2️. View All Employees

* Display all employees with their ID, name, and salary
* Uses `toString()` for neat formatting

### 3️. Search Employee

* Search by Employee ID
* Displays complete details if found

### 4️. Delete Employee

* Delete employee using ID
* Updates list immediately

### 5️. Update Employee

* Modify Name and Salary using employee ID

### 6️. Sorting Options

* **Sort by Name**
* **Sort by Salary**
* Auto-sort by ID happens on every add operation

### 7. Save to file
* Save the data to a file

---

## Project Structure

```
EmployeeManagement/
│
├── Employee.java        # Employee model class
├── Main.java            # Main menu + CRUD logic
└── README.md            # Project documentation
```

---

## Concepts Demonstrated

### 🔹 Java OOP Principles

* Classes and Objects
* Constructors
* Encapsulation (private fields with getters/setters)

### 🔹 Collections Framework

* `ArrayList<Employee>`
* Iteration using loops
* Dynamic storage

### 🔹 DSA Concepts

* Linear Search
* Sorting using Comparator
* CRUD logic structure

### 🔹 User Interaction

* Menu-driven console interface
* Input validation and flow control

---

## How to Run the Project

### Step 1: Compile

```
javac Employee.java Main.java
```

### Step 2: Run

java Main

### Requirements

* Java 8 or above
* Any IDE (IntelliJ / VS Code / Eclipse) or terminal

---

## Sample Output

---- Employee Management System ----
1. Add Employee
2. View Employees
3. Search Employee
4. Delete Employee
5. Update Employee
6. Sort by Name
7. Sort by Salary
8. Save to File
9. Exit
Enter your choice:


---

