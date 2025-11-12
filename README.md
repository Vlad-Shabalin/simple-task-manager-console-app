# 📝 Task Manager (Console Version)

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Status](https://img.shields.io/badge/Status-Active-success)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 📖 Overview
**Task Manager** is a simple Java console application that helps you organize your daily tasks.  
You can easily **add, remove, mark, and view** your tasks — all directly from the command line.  
It’s a great beginner-friendly project to learn **object-oriented programming (OOP)** and core **Java fundamentals** such as classes, methods, arrays, and user input handling.

---

## ⚙️ Features
- ➕ **Add new tasks** with custom names or descriptions  
- 📋 **View all tasks in progress** and completed tasks separately  
- ✅ **Mark tasks as done** or move them back to “in progress”  
- ❌ **Remove specific tasks** or clear all tasks at once  
- 🔄 **Interactive menu** that guides you through available operations  

---

## 🧠 Technologies Used
- Java 17+  
- Standard Java Libraries (`java.util.ArrayList`, `java.util.Scanner`)

---

## 🗂️ Project Structure
```
├── Main.java # Entry point of the program
├── TaskManage.java # Contains logic for managing tasks
└── Task.java # Represents a single task object
```

---

## ▶️ How to Run
1. **Clone the repository**
   ```bash
   git clone https://github.com/VladShabalin/task-manager-console.git
   cd task-manager-console
2. Compile the program
   ```bash
   javac Main.java TaskManage.java Task.java

4. Run the program
   ```bash
   java Main

---

## 🧩 Example Usage
Welcome to your Task Manager!
You have: 2 tasks in progress;
You completed: 1 task;

Choose operation:
1. Add a new task
2. Show all tasks in progress
3. Show all completed tasks
4. Exit

---

## 💡 Future Improvements
- 🔹Save and load tasks from a file
- 🔹Add task deadlines and priorities
- 🔹Improve console UI with colors and formatting
- 🔹Migrate to a graphical (GUI) or web version

---

## 👨‍💻 Author
Created by Vlad Shabalin
