import java.util.Scanner;

public class Training {

    public static int menu(Scanner in) {
        int choix;
        do {
            System.out.println(
                    "\n1-Greeting \n2-Casting\n3-Date\n4-Nombre Pair\n5-Suite de fibonnaci\n6-Nombre premier\n7-Nombre Parfait\n8-Quitter");
            choix = Integer.parseInt(in.nextLine());
        } while (choix < 1 || choix > 8);

        return choix;
    }

    public static void greeting(String name) {
        System.out.println("\nHello " + name);
    }

    public static void casting() {

        final float goldNum = 1.7f;
        float value1 = 18.14f;
        int result;

        result = (int) (value1 / goldNum);

        System.out.println("\nResult is " + result);

    }

    public static void date() {

        Date newDate = new Date() ;

        newDate.getOnlyInformation();
        newDate.getFormatAmerican();
        newDate.getFormatEuropean();
    }

    public static void nombrePair(String nombre) {

        int number = 0;

        try {
            number = Integer.parseInt(nombre);

            if (pair(number))
                System.out.println("\nNombre pair");
            else
                System.out.println("\nNombre impair");

        } catch (NumberFormatException e) {
            System.out.println("\nDsl , on attendait un entier");
        }
    }

    public static void fibonnaci(String nombre) {

        int number = 0;
        try {
            number = Integer.parseInt(nombre);
            if (number < 0)
                System.out.println("\nDsl , on attendait un nombre positif");
            else
                System.out.printf("\nLa valeur du theme d'indice %d pour la suite de Fibonnaci est %d\n",
                        number, fib(number));
        } catch (NumberFormatException e) {
            System.out.println("\nDsl , on attendait en entier");
        }
    }

    public static void nombrePremier(String nombre) {

        int number;

        try {
            number = Integer.parseInt(nombre);

            if (number <= 0)
                System.out.println("\nDsl , on attendait un entier non null");
            else {

                if (premier(number))
                    System.out.println("\nC'est un nombre premier");
                else
                    System.out.println("\nC'est pas un nombre premier");
            }

        } catch (NumberFormatException e) {
            System.out.println("\nDsl , on attendait un entier");
        }
    }

    public static void nombreParfait(String nombre) {
        
        int number;

        try {
            number = Integer.parseInt(nombre);

            if (number <= 0)
                System.out.println("\nDsl , on attendait un entier non null");
            else {

                if (parfait(number))
                    System.out.println("\nC'est un nombre parfait");
                else
                    System.out.println("\nC'est pas un nombre parfait");
            }

        } catch (NumberFormatException e) {
            System.out.println("\nDsl , on attendait un entier");
        }
    }

    public static boolean premier(int number) {

        int nombreDiviseur = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                nombreDiviseur++;
        }

        return nombreDiviseur == 0 ;
    }

     public static int fib(int number) {
        if (number == 0 || number == 1)
            return number ;
        else
            return fib(number - 1) + fib(number - 2);
    }

      public static boolean pair(int number) {
        return number % 2 == 0 ;
    }

    public static boolean parfait(int number) {
        int sommeDiviseur = 0 ;

        for(int i=1 ; i<= number/2 ; i++) {
            if(number % i == 0) 
                sommeDiviseur+=i ;
        }

        return sommeDiviseur == number ;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choix = 0;

        do {
            choix = menu(in);
            switch (choix) {
                case 1:
                    System.out.print("Quel est votre nom : ");
                    greeting(in.nextLine());
                    break;
                case 2:
                    casting();
                    break;
                case 3 :
                    date() ;
                    break ;
                case 4:
                    System.out.print("Entrez votre nombre : ");
                    nombrePair(in.nextLine());
                    break;
                case 5:
                    System.out.print("Entrez un entier : ");
                    fibonnaci(in.nextLine());
                    break;
                case 6:
                    System.out.print("Entrez un entier : ");
                    nombrePremier(in.nextLine());
                    break ;
                case 7 :
                    System.out.print("Entrez un entier : ");
                    nombreParfait(in.nextLine());
                    break ;
            }
        } while (choix != 8);
    }
}
