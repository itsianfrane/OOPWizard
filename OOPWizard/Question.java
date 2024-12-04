
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

