package Tp;

import java.util.Scanner;

public class Abecedarian {
    public static boolean isAbecedarian(String word) {

        word = word.toLowerCase();

        for (int i = 1; i < word.length(); i++) {

            if (word.charAt(i) < word.charAt(i - 1)) 
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = "";
        int continuous = 0;

        System.out.println("\n@@@   Manipulation de chaines de caracteres   @@@\n");

        do {
            System.out.print("Entrez votre mot : ");
            word = scanner.nextLine();
            boolean isAbecedarian = isAbecedarian(word);
            System.out.println("\n" + word + ": " + isAbecedarian);

            System.out.println("\nVoulez vous continuer ? ");
            continuous = Menu.menu(scanner, new String[] { "Oui", "Non" });

        } while (continuous == 1);

        scanner.close();

        System.out.println("\n@@@  Merci d'avoir utilise notre application  @@@");
    }
}
