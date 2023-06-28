package Tp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableauManipulation {

    private List<String> students;

    public TableauManipulation() {
        students = new ArrayList<>();
    }

    public void ajouterElement(String element) {
        students.add(element);
        System.out.println("\nElement ajoute avec succes.");
    }

    public void supprimerElementParValeur(String element) {
        if (students.remove(element)) {
            System.out.println("\nElement supprime avec succes.");
        } else {
            System.out.println("\nElement non trouve dans le tableau.");
        }
    }

    public void supprimerElementParPosition(int position) {
        if (position >= 0 && position < students.size()) {
            students.remove(position);
            System.out.println("\nElement supprime avec succes.");
        } else {
            System.out.println("\nPosition invalide ou element non trouve dans le tableau.");
        }
    }

    public void afficherElements() {
        System.out.println("\nContenu du tableau :\n");
        for (int i = 0; i < students.size(); i++) {
            String student = students.get(i);
            System.out.println(i + 1 + "-" + student);
        }
    }

    public void remplirTableau(String fileName, boolean clean) {

        if (clean)
            students.clear();

        File.read(fileName, students , new Scanner(System.in));

        System.out.println("\nEcrasement reussi avec succes");
    }

    public static void main(String[] args) {

        String[] menuItems = new String[] { "Afficher les elements du tableau", "Ajouter un element au tableau",
                "Supprimer un element a partir de son index", "Supprimer un element a partir de sa valeur",
                "Ecraser le tableau" , "Quitter" };

        TableauManipulation tableau = new TableauManipulation();

        Scanner scanner = new Scanner(System.in);

        int choix;

        tableau.remplirTableau("./Tp/Membres.txt", false);

        System.out.println("\n@@@  Programmation Orient Objet   @@@\n");

        do {
            choix = Menu.menu(scanner, menuItems);
            switch (choix) {
                case 1:
                    tableau.afficherElements();
                    break;
                case 2:
                    System.out.print("Element a ajouter : ");
                    tableau.ajouterElement(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Index de l'element a supprimer : ");
                    tableau.supprimerElementParPosition(Casting.castToInt(scanner.nextLine(), scanner) - 1);
                    break;
                case 4:
                    System.out.print("Element a supprimer : ");
                    tableau.supprimerElementParValeur(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Chemin vers le nouveau fichier : ");
                    tableau.remplirTableau(scanner.nextLine(), true);
                    break;
            }
            System.out.print("\n");
        } while (choix != 6);

        scanner.close();

        System.out.println("\n@@@  Merci d'avoir utilise notre application  @@@");
    }
}
