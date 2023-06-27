public class Palindrome {

    public static void palindrome(String word) {

        if (isPalindrome(word))
            System.out.println("\nC'est un mot palindrome");
        else
            System.out.println("\nC'est pas un mot palindrome");
    }

    public static boolean isPalindrome(String word) {

        int wordLength = word.length();
        word = word.toLowerCase() ;

        for (int i = 0; i < wordLength / 2; i++) {
            if (word.charAt(i) != word.charAt(wordLength - i - 1))
                return false;
        }

        return true;
    }
}
