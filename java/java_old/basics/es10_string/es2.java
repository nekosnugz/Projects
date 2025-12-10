// Esercizio 2: Crea un metodo che verifica se una parola è palindroma (si legge uguale da sinistra e da destra).
import java.util.Scanner;

public class es2 {

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < (int) s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence;
        boolean isSentencePalindrome;

        System.out.print("\nInserisci una frase: ");
        sentence = input.nextLine();

        isSentencePalindrome = isPalindrome(sentence);

        if (isSentencePalindrome) System.out.printf("\nLa frase '%s' è palindroma", sentence);
        else System.out.printf("\nLa frase '%s' non è palindroma", sentence);

        input.close();
    }
}