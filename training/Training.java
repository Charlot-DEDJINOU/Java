import java.util.Scanner;

public class Training {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choix = 0;

        do {
            choix = Menu.menu(in);
            switch (choix) {
                case 1:
                    System.out.print("Quel est votre nom : ");
                    Greeting.greeting(in.nextLine());
                    break;
                case 2:
                    Casting.casting();
                    break;
                case 3 :
                    Date.date() ;
                    break ;
                case 4:
                    System.out.print("Entrez votre nombre : ");
                    NombrePair.nombrePair(in.nextLine());
                    break;
                case 5:
                    System.out.print("Entrez un entier : ");
                    SuiteFibonaci.fibonnaci(in.nextLine());
                    break;
                case 6:
                    System.out.print("Entrez un entier : ");
                    NombrePremier.nombrePremier(in.nextLine());
                    break ;
                case 7 :
                    System.out.print("Entrez un entier : ");
                    NombreParfait.nombreParfait(in.nextLine());
                    break ;
            }
        } while (choix != 8);
    }
}
