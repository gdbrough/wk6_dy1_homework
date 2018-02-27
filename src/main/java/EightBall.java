import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(this.answers);
    }

    public String getRandomAnswer(){
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public void addNewAnswer(String newAnswer){
        this.answers.add(newAnswer);
    }

    public void deleteAnswer(String delAnswer){
        int answerIndex = this.answers.indexOf(delAnswer);
        this.answers.remove(answerIndex);
    }

}
