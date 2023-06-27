import java.util.HashSet;

public class Doublons {

    public static void motDoublon(String mot) {

        if (isDoubloon(mot)) {
            System.out.println("\nLe mot est un doublon.");
        } else {
            System.out.println("\nLe mot n'est pas un doublon.");
        }
    }

    public static boolean isDoubloon(String mot) {
        
        mot = mot.toLowerCase();

        HashSet<Character> lettresUniques = new HashSet<>();

        HashSet<Character> lettresRencontrees = new HashSet<>();

        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);


            if (lettresUniques.contains(lettre)) {
                lettresRencontrees.add(lettre);
            } else {
                lettresUniques.add(lettre);
            }
        }

        return lettresUniques.equals(lettresRencontrees);
    }
}

