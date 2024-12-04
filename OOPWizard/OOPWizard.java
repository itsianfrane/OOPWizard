import java.util.Scanner;

public class OOPWizard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nOOP Wizard: The Ultimate Test\n");
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
