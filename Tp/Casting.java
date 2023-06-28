package Tp;

import java.util.Scanner;

public class Casting {

    public static int castToInt(String number, Scanner scanner) {

        int numberInt;

        while (true) {
            try {
                numberInt = Integer.parseInt(number);
                return numberInt;
            } catch (NumberFormatException e) {
                System.out.print("Prière entrer un entier : ");
                number = scanner.nextLine();
            }
        }
    }
}
