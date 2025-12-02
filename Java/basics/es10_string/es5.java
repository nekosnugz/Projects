// Esercizio 5: Scrivi un metodo che sostituisce tutte le vocali di una stringa con '*'.
import java.util.Scanner;

public class es5 {

    public static String replaceVowels(String s) {
        String vows = "aeiouAEIOU";
        String rep = s;

        for (int i = 0; i < vows.length(); i++) {
            rep = rep.replace(vows.charAt(i), '*');
        }

        System.out.println(rep);

        return rep;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence, censored;

        System.out.print("\nInserisci una frase: ");
        sentence = input.nextLine();
        
        censored = replaceVowels(sentence);

        System.out.printf("\nFrase originale: '%s'", sentence);
        System.out.printf("\nFrase censurata: '%s'", censored);

        input.close();
    }
}