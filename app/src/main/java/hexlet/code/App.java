package hexlet.code;

import static hexlet.code.Cli.chooseMenuItem;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.Engine.run;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] menuItems = {
            "1 - Greet",
            "2 - Even",
            "3 - Calc",
            "4 - GCD",
            "5 - Progression",
            "6 - Prime",
            "0 - Exit"
        };
        int menuItem = chooseMenuItem(scanner, menuItems);

        if (menuItem == 0) {
            scanner.close();
            return;
        }

        String userName = greetUser(scanner);
        switch (menuItem) {
            case 2:
                run(new Even(), userName, scanner);
                break;
            case 3:
                run(new Calc(), userName, scanner);
                break;
            case 4:
                run(new Gcd(), userName, scanner);
                break;
            case 5:
                run(new Progression(), userName, scanner);
                break;
            case 6:
                run(new Prime(), userName, scanner);
                break;
        }
        scanner.close();
    }
}
