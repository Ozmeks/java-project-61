package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static int chooseMenuItem(Scanner scanner, String[] menuItems) {
        System.out.println("Please enter the game number and press Enter.");
        for (String item : menuItems) {
            System.out.println(item);
        }
        System.out.print("Your choice: ");
        String userText = scanner.next();

        int gameCount = menuItems.length - 1;
        int menuItem;
        try {
            menuItem = Integer.parseInt(userText);
            if (menuItem < 0 || menuItem > gameCount) {
                menuItem = 0;
            }
        } catch (NumberFormatException e) {
            menuItem = 0;
        }

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
