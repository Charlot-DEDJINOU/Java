public class NombreParfait {
    
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
    
    public static boolean parfait(int number) {
        int sommeDiviseur = 0 ;

        for(int i=1 ; i<= number/2 ; i++) {
            if(number % i == 0) 
                sommeDiviseur+=i ;
        }

        return sommeDiviseur == number ;
    }
}
