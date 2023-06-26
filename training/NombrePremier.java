public class NombrePremier {
 
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

     public static boolean premier(int number) {

        int nombreDiviseur = 0;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                nombreDiviseur++;
        }

        return nombreDiviseur == 0 ;
    }

}
