package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Calc implements Game {
    private final Random generator;
    private int answer;

    public Calc() {
        this.generator = new Random();
    }

    public String getRulesMessage() {
        return "What is the result of the expression?";
    }

    public String getQuestion() {
        int generatedNumber1 = generator.nextInt(20) + 1;
        int generatedNumber2 = generator.nextInt(20) + 1;
        int generatedNumber3 = generator.nextInt(3) + 1;
        String question;
        switch (generatedNumber3) {
            case 1:
                question = generatedNumber1 + " + " + generatedNumber2;
                answer = generatedNumber1 + generatedNumber2;
                break;
            case 2:
                question = generatedNumber1 + " - " + generatedNumber2;
                answer = generatedNumber1 - generatedNumber2;
                break;
            default:
                question = generatedNumber1 + " * " + generatedNumber2;
                answer = generatedNumber1 * generatedNumber2;
        }

        return question;
    }

    public String getCorrectAnswer() {
        return String.valueOf(answer);
    }
}
