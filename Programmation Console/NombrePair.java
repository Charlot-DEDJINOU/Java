public class NombrePair {
    
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

     public static boolean pair(int number) {
        return number % 2 == 0 ;
    }
}
