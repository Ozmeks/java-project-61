package hexlet.code;

import static hexlet.code.Cli.chooseMenuItem;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.Engine.run;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int menuItem = chooseMenuItem(scanner);

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
        }
        scanner.close();
    }
}
