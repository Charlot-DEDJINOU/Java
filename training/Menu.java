import java.util.Scanner;

public class Menu {
    
     public static int menu(Scanner in) {
        int choix;
        do {
            System.out.println(
                    "\n1-Greeting \n2-Casting\n3-Date\n4-Nombre Pair\n5-Suite de fibonnaci\n6-Nombre premier\n7-Nombre Parfait\n8-Quitter");
            choix = Integer.parseInt(in.nextLine());
        } while (choix < 1 || choix > 8);

        return choix;
    }

}
