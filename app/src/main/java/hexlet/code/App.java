package hexlet.code;

import static hexlet.code.Cli.chooseMenuItem;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.games.Even.playEven;

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
                playEven(scanner, userName);
                break;
            default:
                break;
        }
        scanner.close();
    }
}
