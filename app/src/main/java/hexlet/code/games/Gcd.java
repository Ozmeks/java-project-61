package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Gcd implements Game {
    private final Random generator;
    private int answer;

    public Gcd() {
        this.generator = new Random();
    }

    public String getRulesMessage() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getQuestion() {
        int generatedNumber1 = generator.nextInt(100) + 1;
        int generatedNumber2 = generator.nextInt(100) + 1;

        int a = generatedNumber1;
        int b = generatedNumber2;
        while (b != 0) {
            int currentA = a;
            a = b;
            b = currentA % b;
        }
        answer = a;
        return generatedNumber1 + " " + generatedNumber2;
    }

    public String getCorrectAnswer() {
        return String.valueOf(answer);
    }
}
