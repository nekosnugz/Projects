// Esercizio 4: Crea un metodo che riceve una frase e restituisce il numero di parole (conta gli spazi).
import java.util.Scanner;

public class es4 {

    public static int countWords(String s) {
        int c = 1;
        if (s.length() == 0) return 0;;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') c++;
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence;
        int words;

        System.out.print("\nInserisci una frase: ");
        sentence = input.nextLine();

        words = countWords(sentence);
        
        System.out.printf("\nLa frase '%s' contiene %d parole", sentence, words);

        input.close();
    }
}