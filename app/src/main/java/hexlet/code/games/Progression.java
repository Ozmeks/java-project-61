package hexlet.code.games;

import hexlet.code.Game;
import java.util.Random;

public class Progression implements Game {
    private final Random generator;
    private int answer;

    public Progression() {
        this.generator = new Random();
    }

    public String getRulesMessage() {
        return "What number is missing in the progression?";
    }

    private int[] generateArray(int firstItem, int step) {
        int[] items = new int[10];
        for (int i = 0; i < items.length; i += 1) {
            items[i] = firstItem + i * step;
        }
        return items;
    }

    public String getQuestion() {
        int firstItem = generator.nextInt(10) + 1;
        int step = generator.nextInt(10) + 1;
        int[] items = generateArray(firstItem, step);

        int answerIndex = generator.nextInt(10);
        answer = items[answerIndex];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < items.length; i += 1) {
            if (i == answerIndex) {
                sb.append("..");
            } else {
                sb.append(items[i]);
            }
            sb.append(" ");
        }

        return sb.toString();
    }

    public String getCorrectAnswer() {
        return String.valueOf(answer);
    }
}
