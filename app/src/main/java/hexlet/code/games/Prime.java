package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Prime implements Game {
    private final Random generator;
    private String answer;

    public Prime() {
        this.generator = new Random();
    }

    public String getRulesMessage() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getQuestion() {
        int generatedNumber = generator.nextInt(99) + 1;
        answer = "yes";

        if (generatedNumber == 1 || (generatedNumber % 2 == 0 && generatedNumber != 2)) {
            answer = "no";
        } else {
            double maxCheck = Math.sqrt(generatedNumber);
            for (int i = 3; i < maxCheck; i += 2) {
                if (generatedNumber % i == 0) {
                    answer = "no";
                    break;
                }
            }
        }

        return String.valueOf(generatedNumber);
    }

    public String getCorrectAnswer() {
        return answer;
    }
}
