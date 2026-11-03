package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Even implements Game {
    private final Random generator;
    private String answer;

    public Even() {
        this.generator = new Random();
    }

    public String getRulesMessage() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getQuestion() {
        int generatedNumber = generator.nextInt(99) + 1;
        answer = generatedNumber % 2 == 0 ? "yes" : "no";
        return String.valueOf(generatedNumber);
    }

    public String getCorrectAnswer() {
        return answer;
    }
}
