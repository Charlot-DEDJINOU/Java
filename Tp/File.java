package Tp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class File {

    public static void read(String fileName, List<String> tab, Scanner scanner) {

        while (true) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String ligne;

                while ((ligne = reader.readLine()) != null) {
                    tab.add(ligne);
                }

                break;
            } catch (IOException e) {
                System.out.println("Eureur lors de l'ouverture du fichier ou fichier pas trouve !!!!");
                System.out.print("Chemin vers le fichier ");
                fileName = scanner.nextLine();
            }
        }
    }
}
