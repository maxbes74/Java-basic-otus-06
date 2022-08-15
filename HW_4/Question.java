package HW_4;

public class Question {

    private final String questionStr;
    private boolean userAnswerIsCorrect;
    private final Answer[] answers;

    public Question(String questionStr, Answer[] answers) {
        this.questionStr = questionStr;
        this.userAnswerIsCorrect = false;
        this.answers = answers;
    }

    public String getQuestionStr() {
        return questionStr;
    }

    public boolean isUserAnswerIsCorrect() {
        return userAnswerIsCorrect;
    }

    public void setUserAnswerIsCorrect(boolean userAnswerIsCorrect) {
        this.userAnswerIsCorrect = userAnswerIsCorrect;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswerNumberInArray() {
        for (int i = 0; this.answers.length > i; i++) {
            if (this.answers[i].isCorrect()) {
                return i + 1;
            }
        }
        return 0;
    }
}