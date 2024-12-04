public class WizardQuestion extends Question {
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
