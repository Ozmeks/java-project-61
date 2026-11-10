package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(Game objectGame, String userName, Scanner scanner) {
        System.out.println(objectGame.getRulesMessage());

        int countCorrectAnswers = 0;
        while (countCorrectAnswers < 3) {
            System.out.println("Question: " + objectGame.getQuestion());
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            String correctAnswer = objectGame.getCorrectAnswer();
            if (!correctAnswer.equals(userAnswer)) {
                String errorMessage =
                        "'"
                                + userAnswer
                                + "'"
                                + " is wrong answer ;(. Correct answer was "
                                + "'"
                                + correctAnswer
                                + "'"
                                + ".";
                System.out.println(errorMessage);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            countCorrectAnswers += 1;
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
