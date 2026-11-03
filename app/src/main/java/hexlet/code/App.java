package hexlet.code;

import static hexlet.code.Cli.chooseMenuItem;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.Engine.run;

import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int menuItem = chooseMenuItem(scanner);

        switch (menuItem) {
            case 1:
                greetUser(scanner);
                break;
            case 2:
                String userName = greetUser(scanner);
                run(new Even(), userName, scanner);
                break;
            default:
                break;
        }
        scanner.close();
    }
}
