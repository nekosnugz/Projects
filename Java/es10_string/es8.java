// Esercizio 8: Crea un metodo che inverte l'ordine delle lettere di una stringa.
import java.util.Scanner;

public class es8 {

    public static String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev = rev += s.charAt(i);

        return rev;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence, reversed;

        System.out.print("\nInserisci una frase: ");
        sentence = input.nextLine();

        reversed = reverseString(sentence);

        System.out.printf("\nFrase originale: %s", sentence);
        System.out.printf("\nFrase invertita: %s", reversed);

        input.close();
    }
}