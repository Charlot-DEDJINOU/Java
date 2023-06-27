public class SuiteFibonaci {
    
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

     public static int fib(int number) {
        if (number == 0 || number == 1)
            return number ;
        else
            return fib(number - 1) + fib(number - 2);
    }
}
