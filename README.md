# 🍽️ Restaurant Ordering System (Console App)

![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-4.0.0-blue)
![Build](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

## 📖 Project Overview
The **Restaurant Ordering System** is a text-based Java console application that simulates a restaurant’s ordering process.  
It demonstrates **Core Java** and **OOP principles** including encapsulation, inheritance, and collections.  

### ✨ Features
- 📋 MenuItem (has name, category, price, description)
- 📋 Menu (Breakfast, Pasta, Pizza, Ice Cream, desserts)
- 🛒 OrderItem (is a MenuItem with quantity)
- 🛒 Order (add, remove, update items & quantities)
- 💰 Billing with tax and discounts

---

## ⚙️ Tech Stack
- **Java:** Oracle OpenJDK 21  
- **Maven:** 4.0.0  
- **IDE:** IntelliJ IDEA  

---

## 🏗️ Build & Run Instructions

### 🔧 Build
```bash
mvn clean install
```

### ▶️ Run
Since this is a console application:
```bash
# Option 1: Run with Maven
mvn exec:java -Dexec.mainClass="com.example.Main"

# Option 2: Run compiled JAR
java -jar target/restaurant-app.jar
```

### 🧪 Test
```bash
mvn test
```

---

## 👥 Team Members
| Name | LinkedIn |
|------|-----------|
| Huda Karam | [LinkedIn](https://www.linkedin.com/in/hoda-karam-ab6009142/) |
| Fatma Eissa | [LinkedIn](http://www.linkedin.com/in/fatma-essa-63a658197) |
| Arwa Elnemr | [LinkedIn](https://www.linkedin.com/in/arwaelnemr/) |
| Mohammed Samir | [LinkedIn](https://www.linkedin.com/in/mohammed-samir-2a6544243/) |

---

## 📈 Future Enhancements
- Add GUI (JavaFX or web-based interface).  
- Support online reservations.  
- Implement database integration for persistent storage.  
- Enhance discount & promotion logic.  
