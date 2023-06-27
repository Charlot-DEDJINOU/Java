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
                case 3:
                    Date.date();
                    break;
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
                    break;
                case 7:
                    System.out.print("Entrez un entier : ");
                    NombreParfait.nombreParfait(in.nextLine());
                    break;
                case 8:
                    System.out.print("Chemin pour la creation du fichier : ");
                    File.create(in.nextLine());
                    break;
                case 9:
                    System.out.print("Chemin vers le fichier de lecture : ");
                    File.read(in.nextLine());
                    break;
                case 10:
                    System.out.print("Chemin vers le fichier d'ecriture : ");
                    File.write(in.nextLine(), in);
                    break;
                case 11:
                    System.out.print("Entrez votre mot : ");
                    Doublons.motDoublon(in.nextLine());
                    break;
                case 12:
                    System.out.print("Entrez votre mot : ");
                    Palindrome.palindrome(in.nextLine());
                    break;
            }
        } while (choix != 13);
    }
}
