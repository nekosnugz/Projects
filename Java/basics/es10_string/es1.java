// Esercizio 1: Scrivi un metodo che conta quante vocali ci sono in una stringa inserita dall'utente.
import java.util.Scanner;

public class es1 {

    public static int countVowels(String s) {
        String vows = "aeiouAEIOU";
        int c = 0;  // c = count

        for (int i = 0; i < s.length(); i++) {
            char charToCheck = s.charAt(i);
            if (vows.indexOf(charToCheck) != -1) c++;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence;
        int count;

        System.out.print("\nInserisci una frase: ");
        sentence = input.nextLine();

        count = countVowels(sentence);

        System.out.printf("\nLa frase '%s' contiene %d vocali", sentence, count);

        input.close();
    }
}