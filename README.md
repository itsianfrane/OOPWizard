
<div align="center">
  <img src="https://github.com/itsianfrane/OOPWizard/blob/main/images/logo.png" alt="OOPWIzard Logo" width="400" height="240">

  <h1>OOP Wizard: The Ultimate Test</h1>
  
  <h3> 
  🎮 An interactive Java-based quiz program designed to challenge and enhance your understanding of key OOP terminologies. 
  
  </br>[Marianito F. Frane](https://github.com/itsianfrane) <br> 
  IT 2104
  <hr class="w-48 h-1 mx-auto my-4 bg-gray-100 border-0 rounded md:my-10 dark:bg-gray-700">
</div>

# OOP Wizard: The Ultimate Test

## 📚 Table of Contents
1. [🔎 Project Overview](#-project-overview)  
2. [💻 Features](#-features)  
3. [🧠 Python Concepts Applied](#-python-concepts-applied)  
    - [Classes and Objects](#classes-and-objects)  
    - [Encapsulation](#encapsulation)  
    - [Polymorphism](#polymorphism)  
    - [Inheritance](#inheritance)  
    - [Abstraction](#abstraction)  
4. [👪 Integration of SDG 4: Quality Education](#-integration-of-sdg-4-quality-education)  
5. [⚙️ System Requirements](#%EF%B8%8F-system-requirements)  
6. [🛠️ Installation and Setup](#%EF%B8%8F-installation-and-setup)  
7. [❓ How to Run the Program](#-how-to-run-the-program)  
8. [🗺️ Usage Instructions](#%EF%B8%8F-usage-instructions)  
9. [🔜 Future Improvements](#-future-improvements)  
10. [❤️ Acknowledgement](#%EF%B8%8F-acknowledgement)

---

## 🔎 Project Overview

**OOP Wizard: The Ultimate Test** is an educational Java program designed to test the knowledge of Object-Oriented Programming (OOP) concepts through a quiz interface. The project allows users to answer questions related to OOP concepts such as Encapsulation, Polymorphism, Inheritance, and Abstraction.

The program is implemented with both a command-line interface (CLI) and a graphical user interface (GUI) using Java's Swing framework. The user is prompted for their name, course/section, and subject before starting the quiz.

---

## 💻 Features

- **Multiple Choice Questions**: The quiz includes a set of 20 multiple-choice questions related to OOP.
- **Dynamic Feedback**: Immediate feedback for each answer (Correct/Incorrect).
- **Score Calculation**: Displays the final score at the end of the quiz.
- **User Information**: Collects and displays user information such as name, course/section, and subject.
- **GUI and CLI Modes**: Available in both command-line and graphical user interface versions for different user preferences.

---

## 🧠 Python Concepts Applied

While the project is written in Java, the following object-oriented programming principles are applied:

### Classes and Objects
- The program utilizes **classes** such as `QuizApp` and `Question` to define the behavior of the application and quiz logic. **Objects** are instances of these classes that represent specific quiz components.

### Encapsulation
- The `QuizApp` class encapsulates the quiz logic, storing user information and questions. The details of how questions are stored and how scoring works are hidden from the user interface.

### Polymorphism
- The `Question` class is abstract, and the concrete class `WizardQuestion` overrides the `displayChoices()` method, demonstrating **polymorphism** in action. Different types of questions can be created and handled similarly.

### Inheritance
- The `WizardQuestion` class **inherits** from the `Question` class, utilizing the base functionality and extending it with specific question behavior.

### Abstraction
- The `Question` class is abstract, providing a blueprint for creating various types of questions while hiding implementation details such as how choices are displayed and validated.

---

## 👪 Integration of SDG 4: Quality Education

This project contributes to **SDG 4: Quality Education** by providing an interactive and accessible platform for learning and testing key programming concepts. It helps students reinforce their understanding of Object-Oriented Programming in Java and promotes educational growth in the field of computer science.

---

## ⚙️ System Requirements

- Java Development Kit (JDK) version 8 or higher.
- A Java IDE such as IntelliJ IDEA, Eclipse, or NetBeans.
- Operating System: Windows, macOS, or Linux.

---

## 🛠️ Installation and Setup
To run the OOP Wizard:

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/OOPWizard.git
2. Navigate to the project directory:
   ```bash
   cd OOPWizard
3. Compile the code (if using a terminal):
    ```bash
    javac OOPWizard.java
4. Run the program:
    ```bash
   java OOPWizard

## ❓ How to Run the Program
- **Console Version**: After running the program, the user will be prompted to enter their name, course, and subject. They will then proceed through a series of multiple-choice questions related to OOP.
- **GUI Version**: The user will input their details via text fields in the graphical interface. After clicking "`Start Quiz`," they will navigate through questions with buttons for each answer.

## 🗺️ Usage Instructions
- **Start Quiz**: Once the user inputs their details (name, course, subject), they can click "Start Quiz" to begin.
Answering Questions: For each question, the user selects the appropriate answer.
- **End of Quiz**: At the end of the quiz, the user’s score will be displayed along with their personal details for reference.

## 🔜 Future Improvements
- **Database Integration**: Store user scores and progress for future reference.
- **More Interactive GUI**: Adding images, tooltips, or explanations for each question to make the quiz more engaging.
- **Mobile Version**: Develop an Android or iOS version of the quiz for broader accessibility.

## ❤️ Acknowledgement
> First and foremost, I would like to express my deepest gratitude to **Almighty God** for His unending guidance, wisdom, and strength throughout this project.

> To my **family** and **family**, thank you for your unwavering support, love, and encouragement that pushed me to strive for excellence. 

> To my **crushiecakes**, thank you for being my daily source of joy and inspiration.

> A special thank you goes to my professor, **Mr. Jayson R. Abratique**, for his invaluable guidance, insightful feedback, and continuous encouragement. Your mentorship has been a significant part of my growth, and I am truly grateful for your dedication and support.

> To **all** who have been part of this journey, my heartfelt thanks.
