// Esercizio 7: Scrivi un metodo che trova la parola più lunga in una frase (separata da spazi).
import java.util.Scanner;

public class es7 {

    public static String longestWord(String s) {
        String[] strs = s.split("[ ]");
        int maxIndex = 0;
        
        for (int i = 1; i < strs.length; i++) {
            if (strs[maxIndex].length() < strs[i].length()) maxIndex = i;
        }   
        
        return strs[maxIndex];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence, longest;

        System.out.print("\nInserisci una frase: ");
        sentence = input.nextLine();

        longest = longestWord(sentence);

        System.out.printf("\nParola piu' lunga nella frase: %s", longest);

        input.close();
    }
}