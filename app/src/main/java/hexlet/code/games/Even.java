package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Even implements Game {
    private final Random generator;
    private int generatedNumber;

    public Even() {
        this.generator = new Random();
    }

    public String getRulesMessage() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getQuestion() {
        this.generatedNumber = generator.nextInt(99) + 1;
        return String.valueOf(this.generatedNumber);
    }

    public String getCorrectAnswer() {
        return this.generatedNumber % 2 == 0 ? "yes" : "no";
    }
}
