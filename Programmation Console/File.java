import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {

    public static void read(String fileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String ligne;
            System.out.print('\n');
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }

    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean fileExist(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return true ;
        } catch (IOException e) {
            return false ;
        }
    }

    public static void write(String fileName , Scanner in) {

        if(!fileExist(fileName))
            create(fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

            System.out.println("Taper votre texte et ensuite @sq pour sauvegarder et quitter : ");
            String text = "";

            while (true) {
                text = in.nextLine();

                if (text.equals("@sq")){
                     break;
                }

                writer.newLine(); 
                writer.write(text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void create(String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))) {

            writer.write("@@@   " + fileName.split("/")[fileName.split("/").length - 1].split("\\.")[0] + "   @@@\n");

            System.out.println("Nouveau fichier cree avec succes !!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
