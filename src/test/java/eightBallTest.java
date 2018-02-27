import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class eightBallTest {

    private EightBall eightBallAnswers;

    @Before
    public void before(){
        ArrayList<String> answers = new ArrayList<>();
        answers.add("Ask again later");
        answers.add("It doesn't look likely");
        answers.add("It's possible");
        answers.add("Maybe, but maybe not");
        eightBallAnswers = new EightBall(answers);
    }

    @Test
    public void canGetRandomAnswer(){
        ArrayList<String> answers = eightBallAnswers.getAnswers();
        String randomAnswer = eightBallAnswers.getRandomAnswer();
        assertTrue(answers.contains(randomAnswer));
    }

    @Test
    public void canAddNewAnswer(){
        eightBallAnswers.addNewAnswer("New Answer");
        ArrayList<String> answers = eightBallAnswers.getAnswers();
        assertTrue(answers.contains("New Answer"));
    }

    @Test
    public void canRemoveExistingAnswer(){
        eightBallAnswers.deleteAnswer("Ask again later");
        ArrayList<String> answers = eightBallAnswers.getAnswers();
        assertFalse(answers.contains("Ask again later"));
    }

}
