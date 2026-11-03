package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playEven(Scanner scanner, String userName) {
        Random generator = new Random();
        int countCorrectAnswers = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (countCorrectAnswers < 3) {
            int newNumber = generator.nextInt(99) + 1;
            System.out.println("Question: " + newNumber);
            String userAnswer = scanner.next();
            String correctAnswer = newNumber % 2 == 0 ? "yes" : "no";
            System.out.println("Your answer: " + userAnswer);
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
        System.out.println("Congratulations, " + userName);
    }
}
