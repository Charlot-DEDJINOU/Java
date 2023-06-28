package Tp;

import java.util.Scanner;

public class Menu {

    public static int menu(Scanner scanner, String[] items) {

        int choix;

        do {
            for (int i = 0; i < items.length; i++)
                System.out.println(i + 1 + "-" + items[i]);

            choix = Casting.castToInt(scanner.nextLine(), scanner);

        } while (choix < 1 || choix > items.length);

        return choix;
    }
}
