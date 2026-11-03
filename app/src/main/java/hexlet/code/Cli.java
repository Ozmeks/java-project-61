package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static int chooseMenuItem(Scanner scanner) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String userText = scanner.next();

        int menuItem;
        try {
            menuItem = Integer.parseInt(userText);
        } catch (NumberFormatException e) {
            menuItem = 0;
        }
        System.out.println("Your choice: " + menuItem);

        return menuItem;
    }

    public static String greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
