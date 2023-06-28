package Tp;

import java.util.Scanner;

public class FibonacciVariant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int continuous = 0;

        System.out.println("\n@@@  Variante de la suite de Fibonacci c = (a + b) * 3.14  @@@");

        do {
            System.out.print("\nEntrez le nombre de termes a afficher : ");
            int iterations = Casting.castToInt(scanner.nextLine(), scanner);

            customFibonacci(iterations);

            System.out.println("\nVoulez vous continuer ? ");
            continuous = Menu.menu(scanner, new String[] { "Oui", "Non" });

        } while (continuous == 1);

        scanner.close();

        System.out.println("\n@@@  Merci d'avoir utilise notre application  @@@");
    }

    public static void customFibonacci(int iterations) {
        long a = 0;
        long b = 1;

        switch (iterations) {
            case 0:
                System.out.print("\n");
                break;
            case 1:
                System.out.print("\n" + a);
                break;
            default:
                System.out.print("\n" + a + " " + b + " ");

                for (int i = 2; i < iterations; i++) {
                    int c = (int) ((a + b) * 3.14);
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
        }
    }
}
