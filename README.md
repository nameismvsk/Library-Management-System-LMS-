# 📖 Library Management System (LMS)

## Introduction
The **Library Management System (LMS)** is a simple console-based Java program that allows users to:

- 📚 Borrow books for a limited duration.
- 🔄 Return books and check for overdue fines.
- 💰 Sell books to the library.
- 📋 Display available books.

This project is beginner-friendly and demonstrates the use of Java basics, including **user input handling, loops, conditions, and arrays**.

---

## 🎯 Features
✅ Add books to the library  
✅ Borrow books with a limit of **60 days**  
✅ Calculate fine if book return exceeds the limit (**₹10 per extra day**)  
✅ Sell books to the library (**Buying price between ₹20 to ₹100**)  
✅ Simple **console-based interaction**  

---

## 🛠️ Technologies Used
- **Java** (JDK 8 or higher)
- **Scanner Class** for user input
- **Conditional Statements** for validations
- **Loops** for menu-driven interaction
- **Arrays** to store book data

---

## 🚀 How to Run the Project

### Step 1: Clone the Repository
```bash
git clone https://github.com/your-username/Library-Management-System.git
```

### Step 2: Navigate to the Project Directory
```bash
cd Library-Management-System
```

### Step 3: Compile and Run the Java Program
```bash
javac LibraryManagement.java
java LibraryManagement
```

---

## 📌 How It Works

1️⃣ The user is shown a list of available books.  
2️⃣ The user borrows a book by entering its name.  
3️⃣ The system calculates the **borrowing price** (**₹5 per day**) based on the chosen number of days.  
4️⃣ The user selects a **payment method** (**Online/Offline**).  
5️⃣ If the book is returned after **60 days**, a **fine** (**₹10 per extra day**) is charged.  
6️⃣ Users can **sell books** to the library for a random price (**₹20 - ₹100**).  
7️⃣ A **thank you message** is displayed upon completion.  

---

## 📌 Example Output

```bash
📚 Available Books:
- Python
- Java
- JavaScript
- C#
- C++
- PHP
- Swift
- Go
- SQL
- R

Enter the book name to borrow: Java
✔ You chose: Java
Enter the number of days to borrow (Max 60 days): 40
💰 Borrowing price: ₹200
Choose payment method (Online/Offline): Online
✅ Payment successful via Online
📖 Enjoy reading Java!

Enter the number of days you kept the book: 65
⚠ You exceeded the borrowing limit by 5 days.
💰 Fine amount: ₹50

Do you want to sell a book to the library? (yes/no): yes
Enter the book name to sell: Kotlin
💰 The library will buy Kotlin for ₹85

📚 Thank you for using the Library Management System!
```

---

## 🏗️ Future Enhancements
- 🔹 Implement a **database** to store book details permanently.
- 🔹 Add a **user login system** for tracking borrowed books.
- 🔹 Introduce **categories & search functionality** for books.
- 🔹 Improve **UI with a graphical interface (Swing/JavaFX)**.

---

## 🤝 Contributing

1. **Fork** the repository.
2. Create a **new branch**:
   ```bash
   git checkout -b feature-branch
   ```
3. **Commit your changes**:
   ```bash
   git commit -m 'Add new feature'
   ```
4. **Push to the branch**:
   ```bash
   git push origin feature-branch
   ```
5. **Open a Pull Request**.

---

## 📜 License
This project is licensed under the **MIT License**.

---

## ⭐ Support
💡 If you found this project helpful, don't forget to ⭐ **star** the repository! 🚀

