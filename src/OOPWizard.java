import java.util.ArrayList;
import java.util.Scanner;

public class OOPWizard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("OOP Wizard: The Ultimate Test\n");
        // Ask for user details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your Course/Section: ");
        String yearLevel = scanner.nextLine();
        
        System.out.print("Enter the subject: ");
        String subject = scanner.nextLine();

        // Start the quiz
        QuizApp quizApp = new QuizApp(name, yearLevel, subject);
        quizApp.startQuiz();
        
        scanner.close();
    }
}

class QuizApp {
    private ArrayList<Question> questions;
    private int score;
    private String name;
    private String yearLevel;
    private String subject;

    public QuizApp(String name, String yearLevel, String subject) {
        this.name = name;
        this.yearLevel = yearLevel;
        this.subject = subject;
        questions = new ArrayList<>();
        score = 0;
        //20 OOP-related questions
        addQuestions();
    }

    private void addQuestions() {
        questions.add(new WizardQuestion(
            "\nWhat does OOP stand for?",
            "A",
            new String[]{"Object-Oriented Programming", "Open-Oriented Programming", "Only-Oriented Programming", "Object-Organized Programming"}
        ));
        questions.add(new WizardQuestion(
            "Which of these is an OOP concept?",
            "D",
            new String[]{"Encapsulation", "Inheritance", "Polymorphism", "All of the Above"}
        ));
        questions.add(new WizardQuestion(
            "What keyword is used to inherit from another class in Java?",
            "A",
            new String[]{"extends", "this", "super", "interface"}
        ));
        questions.add(new WizardQuestion(
            "What is a class in Java?",
            "B",
            new String[]{"A method", "A blueprint for creating objects", "A type of variable", "A function"}
        ));
        questions.add(new WizardQuestion(
            "What does a constructor do in Java?",
            "A",
            new String[]{"Initializes objects", "Prints output", "Reads input", "Inherits methods"}
        ));
        questions.add(new WizardQuestion(
            "What is the primary data type for whole numbers in Java?",
            "B",
            new String[]{"integer", "int", "num", "whole"}
        ));
        questions.add(new WizardQuestion(
            "What is the correct syntax for printing \"Hello, World!\" to the console in Java?",
            "C",
            new String[]{"Console.WriteLine(\"Hello, World!\");", "print(\"Hello, World!\");", "System.out.println(\"Hello, World!\");", "echo \"Hello, World!\";"}
        ));
        questions.add(new WizardQuestion(
            "Which of the following is an example of inheritance in OOP?",
            "A",
            new String[]{"A child class inheriting from a parent class", "A class implementing an interface", "A class containing methods", "A class with a constructor"}
        ));
        questions.add(new WizardQuestion(
            "Which of the following is an example of polymorphism?",
            "B",
            new String[]{"Using different classes for different tasks", "A method having the same name but different behavior in different classes", "Using different data types", "Inheritance"}
        ));
        questions.add(new WizardQuestion(
            "What is encapsulation in OOP?",
            "C",
            new String[]{"Accessing data directly", "Inheriting methods", "Hiding internal details and showing only necessary parts", "Polymorphism"}
        ));
        questions.add(new WizardQuestion(
            "Which of the following is a private method?",
            "A",
            new String[]{"A method that cannot be accessed outside its class", "A method that is shared between classes", "A method that only returns values", "A method with no parameters"}
        ));
        questions.add(new WizardQuestion(
            "Which of the following does NOT belong to the 4 OOP principles?",
            "D",
            new String[]{"Encapsulation", "Inheritance", "Polymorphism", "Compilation"}
        ));
        questions.add(new WizardQuestion(
            "What is a method in Java?",
            "B",
            new String[]{"A class", "A block of code that performs a specific task", "A constructor", "A variable"}
        ));
        questions.add(new WizardQuestion(
            "What is the purpose of the main method in a Java program?",
            "C",
            new String[]{"It's the last method to be executed.", "It's used for defining classes.", "It's the entry point of the program, where execution begins.", "It's used for input and output operations."}
        ));
        questions.add(new WizardQuestion(
            "Which of these is used to define a constant in Java?",
            "C",
            new String[]{"final", "static", "public", "private"}
        ));
        questions.add(new WizardQuestion(
            "What is the purpose of a method's return type?",
            "A",
            new String[]{"It defines what type of value the method will return", "It specifies the method's parameters", "It defines the method's name", "It determines the method's access level"}
        ));
        questions.add(new WizardQuestion(
            "Which of these is an abstract method?",
            "B",
            new String[]{"A method that has no body and must be implemented by subclasses", "A method that contains a return statement", "A method that is static", "A method that uses inheritance"}
        ));
        questions.add(new WizardQuestion(
            "What is an object in OOP?",
            "A",
            new String[]{"An instance of a class", "A type of method", "A part of a constructor", "A variable"}
        ));
        questions.add(new WizardQuestion(
            "What is the keyword used to handle exceptions in Java?",
            "D",
            new String[]{"try", "catch", "throw", "All of the above"}
        ));
        questions.add(new WizardQuestion(
            "What does a class constructor initialize?",
            "A",
            new String[]{"An object of the class", "A method", "A variable", "A constant"}
        ));
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            question.displayChoices();
            System.out.print("Enter your answer: ");
            String answer = scanner.nextLine();

            if (question.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
            System.out.println();
        }
        System.out.println("Quiz finished! Your score is: " + score + "/" + questions.size());
        
        // Display user info with the score
        System.out.println("\nUser Info:");
        System.out.println("Name: " + name);
        System.out.println("Year level: " + yearLevel);
        System.out.println("Subject: " + subject);
        
        scanner.close();
    }
}

abstract class Question {
    protected String questionText;
    protected String correctAnswer;
    protected String[] choices;

    public Question(String questionText, String correctAnswer, String[] choices) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.choices = choices;
    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract void displayChoices();

    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}

class WizardQuestion extends Question {
    public WizardQuestion(String questionText, String correctAnswer, String[] choices) {
        super(questionText, correctAnswer, choices);
    }

    @Override
    public void displayChoices() {
        char option = 'A';
        for (String choice : choices) {
            System.out.println(option + ") " + choice);
            option++;
        }
    }
}
