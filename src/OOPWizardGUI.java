import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OOPWizardGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(OOPWizardGUI::createLoginPage);
    }

    public static void createLoginPage() {
        JFrame loginFrame = new JFrame("OOP Wizard: Students Info");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(500, 500);
        loginFrame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(240, 240, 240));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("OOP Wizard: The Ultimate Test");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setForeground(new Color(0, 51, 102));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        JLabel nameLabel = new JLabel("Enter your Name:");
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        JLabel courseLabel = new JLabel("Course/Section:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(courseLabel, gbc);

        JTextField courseField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(courseField, gbc);

        JLabel subjectLabel = new JLabel("Subject:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(subjectLabel, gbc);

        JTextField subjectField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(subjectField, gbc);

        JButton startButton = new JButton("Start Quiz");
        startButton.setBackground(new Color(0, 102, 204));
        startButton.setForeground(Color.WHITE);
        startButton.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(startButton, gbc);

        startButton.addActionListener(_ -> {
            String name = nameField.getText().trim();
            String course = courseField.getText().trim();
            String subject = subjectField.getText().trim();

            if (name.isEmpty() || course.isEmpty() || subject.isEmpty()) {
                JOptionPane.showMessageDialog(loginFrame, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                loginFrame.dispose();
                QuizApp quizApp = new QuizApp(name, course, subject);
                quizApp.startQuiz();
            }
        });

        loginFrame.add(panel, BorderLayout.CENTER);
        loginFrame.setVisible(true);
    }
}

class QuizApp {
    private final String name;
    private final String course;
    private final String subject;
    private final ArrayList<Question> questions;
    private int score;
    private int currentQuestionIndex;

    public QuizApp(String name, String course, String subject) {
        this.name = name;
        this.course = course;
        this.subject = subject;
        this.questions = new ArrayList<>();
        this.score = 0;
        this.currentQuestionIndex = 0;
        addQuestions();
    }

    private void addQuestions() {
        questions.add(new Question("What does OOP stand for?", "A",
                new String[]{"A. Object-Oriented Programming", "B. Open-Oriented Programming",
                        "C. Only-Oriented Programming", "D. Object-Organized Programming"}));
        questions.add(new Question("Which of these is an OOP concept?", "D",
                new String[]{"A. Encapsulation", "B. Inheritance", "C. Polymorphism", "D. All of the Above"}));
        questions.add(new Question("What keyword is used to inherit from another class in Java?", "A",
                new String[]{"A. extends", "B. this", "C. super", "D. interface"}));
        questions.add(new Question("What is a class in Java?", "B",
                new String[]{"A. A method", "B. A blueprint for creating objects", "C. A type of variable", "D. A function"}));
        questions.add(new Question("What does a constructor do in Java?", "A",
                new String[]{"A. Initializes objects", "B. Prints output", "C. Reads input", "D. Inherits methods"}));
        questions.add(new Question("What is the primary data type for whole numbers in Java?", "B",
                new String[]{"A. integer", "B. int", "C. num", "D. whole"}));
        questions.add(new Question("What is the correct syntax for printing \"Hello, World!\" to the console in Java?", "C",
                new String[]{"A. Console.WriteLine(\"Hello, World!\");", "B. print(\"Hello, World!\");", "C. System.out.println(\"Hello, World!\");", "D. echo \"Hello, World!\";"}));
        questions.add(new Question("Which of the following is an example of inheritance in OOP?", "A",
                new String[]{"A. A child class inheriting from a parent class", "B. A class implementing an interface", "C. A class containing methods", "D. A class with a constructor"}));
        questions.add(new Question("Which of the following is an example of polymorphism?", "B",
                new String[]{"A. Using different classes for different tasks", "B. A method having the same name but different behavior in different classes", "C. Using different data types", "D. Inheritance"}));
        questions.add(new Question("What is encapsulation in OOP?", "C",
                new String[]{"A. Accessing data directly", "B. Inheriting methods", "C. Hiding internal details and showing only necessary parts", "D. Polymorphism"}));
        questions.add(new Question("Which of the following is a private method?", "A",
                new String[]{"A. A method that cannot be accessed outside its class", "B. A method that is shared between classes", "C. A method that only returns values", "D. A method with no parameters"}));
        questions.add(new Question("Which of the following does NOT belong to the 4 OOP principles?", "D",
                new String[]{"A. Encapsulation", "B. Inheritance", "C. Polymorphism", "D. Compilation"}));
        questions.add(new Question("What is a method in Java?", "B",
                new String[]{"A. A class", "B. A block of code that performs a specific task", "C. A constructor", "D. A variable"}));
        questions.add(new Question("What is the purpose of the main method in a Java program?", "C",
                new String[]{"A. It's the last method to be executed.", "B. It's used for defining classes.", "C. It's the entry point of the program, where execution begins.", "D. It's used for input and output operations."}));
        questions.add(new Question("Which of these is used to define a constant in Java?", "C",
                new String[]{"A. final", "B. static", "C. public", "D. private"}));
        questions.add(new Question("What is the purpose of a method's return type?", "A",
                new String[]{"A. It defines what type of value the method will return", "B. It specifies the method's parameters", "C. It defines the method's name", "D. It determines the method's access level"}));
        questions.add(new Question("Which of these is an abstract method?", "B",
                new String[]{"A. A method that has no body and must be implemented by subclasses", "B. A method that contains a return statement", "C. A method that is static", "D. A method that uses inheritance"}));
        questions.add(new Question("What is an object in OOP?", "A",
                new String[]{"A. An instance of a class", "B. A type of method", "C. A part of a constructor", "D. A variable"}));
        questions.add(new Question("What is the keyword used to handle exceptions in Java?", "D",
                new String[]{"A. try", "B. catch", "C. throw", "D. All of the above"}));
        questions.add(new Question("What does a class constructor initialize?", "A",
                new String[]{"A. An object of the class", "B. A method", "C. A variable", "D. A constant"}));
    }

    public void startQuiz() {
        JFrame quizFrame = new JFrame("OOP Wizard: The Ultimate Test");
        quizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizFrame.setSize(700, 500);
        quizFrame.setLayout(new BorderLayout());

        JPanel questionPanel = new JPanel(new GridLayout(2, 1));
        questionPanel.setBackground(Color.WHITE);

        JLabel questionLabel = new JLabel("", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        questionPanel.add(questionLabel);

        JPanel answerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        answerPanel.setBackground(Color.WHITE);
        questionPanel.add(answerPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        quizFrame.add(questionPanel, BorderLayout.CENTER);
        quizFrame.add(buttonPanel, BorderLayout.SOUTH);

        displayQuestion(questionLabel, answerPanel, quizFrame);
        quizFrame.setVisible(true);
    }

    private void displayQuestion(JLabel questionLabel, JPanel answerPanel, JFrame quizFrame) {
        answerPanel.removeAll();

        if (currentQuestionIndex < questions.size()) {
            Question currentQuestion = questions.get(currentQuestionIndex);
            questionLabel.setText("<html>" + currentQuestion.getQuestionText() + "<br>" +
                    String.join("<br>", currentQuestion.getChoices()) + "</html>");

            for (String choice : currentQuestion.getChoices()) {
                JButton choiceButton = new JButton(choice);
                choiceButton.setBackground(new Color(204, 229, 255));
                choiceButton.setFont(new Font("Arial", Font.PLAIN, 14));
                choiceButton.addActionListener(_ -> {
                    String selectedAnswer = choice.substring(0, 1); // Extract 'A', 'B', 'C', 'D'
                    if (selectedAnswer.equalsIgnoreCase(currentQuestion.getCorrectAnswer())) {
                        score++;
                        JOptionPane.showMessageDialog(quizFrame, "Correct!", "Result", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(quizFrame, "Incorrect!", "Result", JOptionPane.ERROR_MESSAGE);
                    }
                    currentQuestionIndex++;
                    displayQuestion(questionLabel, answerPanel, quizFrame);
                });
                answerPanel.add(choiceButton);
            }

            quizFrame.revalidate();
            quizFrame.repaint();
        } else {
            quizFrame.dispose();
            showResults();
        }
    }

    private void showResults() {
        String resultMessage = "<html><h2>Quiz Completed!</h2>" +
                "<p><b>Name:</b> " + name + "</p>" +
                "<p><b>Course/Section:</b> " + course + "</p>" +
                "<p><b>Subject:</b> " + subject + "</p>" +
                "<p><b>Score:</b> " + score + "/" + questions.size() + "</p></html>";

        JOptionPane.showMessageDialog(null, resultMessage, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
    }
}

class Question {
    private final String questionText;
    private final String correctAnswer;
    private final String[] choices;

    public Question(String questionText, String correctAnswer, String[] choices) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.choices = choices;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String[] getChoices() {
        return choices;
    }
}
