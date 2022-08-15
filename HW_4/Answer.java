package HW_4;

public class Answer {

    private final String answerStr;
    private final boolean isCorrect;

    public Answer(String answerStr, boolean isCorrect) {
        this.answerStr = answerStr;
        this.isCorrect = isCorrect;
    }

    public String getAnswerStr() {
        return answerStr;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

}
