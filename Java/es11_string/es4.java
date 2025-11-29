// Esercizio 4: Implementa un programma che analizzi una frase inserita dall'utente.
// Crea metodi separati per: contare le vocali, contare le consonanti, contare le parole e
// verificare se la frase è un palindromo (ignorando spazi e maiuscole/minuscole).

import java.util.Scanner;
// import java.util.Random;

public class es4 {
    public static int countVowels(String s) {
        int v = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'a' ||
                s.toLowerCase().charAt(i) == 'e' ||
                s.toLowerCase().charAt(i) == 'i' ||
                s.toLowerCase().charAt(i) == 'o' ||
                s.toLowerCase().charAt(i) == 'u') v++;
        }
        return v;
    }
    
    public static int countConsonants(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.toLowerCase().charAt(i) >= 'a' && s.toLowerCase().charAt(i) <= 'z') &&
            (   s.toLowerCase().charAt(i) != 'a' ||
                s.toLowerCase().charAt(i) != 'e' ||
                s.toLowerCase().charAt(i) != 'i' ||
                s.toLowerCase().charAt(i) != 'o' ||
                s.toLowerCase().charAt(i) != 'u')) c++;
        }
        return c;
    }

    public static int countWords(String s) {
        String[] strs = s.trim().split(" ");
        return strs.length;
    }

    public static boolean isStringPalindrome(String s) {
        String tempWord = s.trim();
        String word = "";
        char tempC;

        for (int i = 0; i < word.length(); i++) {
            tempC = tempWord.toLowerCase().charAt(i);
            if (tempC != ' ') word += tempC;
        }

        for (int i = 0; i < (int) word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String phrase;
        int nVowels, nCons, nWords;
        boolean isPalindrome;

        System.out.print("\nInserisci una frase: ");
        phrase = input.nextLine();

        nVowels = countVowels(phrase);
        nCons = countConsonants(phrase);
        nWords = countWords(phrase);
        isPalindrome = isStringPalindrome(phrase);

        System.out.printf("\nNumero vocali: %d", nVowels);
        System.out.printf("\nNumero consonanti: %d", nCons);
        System.out.printf("\nNumero parole: %d", nWords);
        if (isPalindrome) System.out.print("\nLa frase è palindroma");
        else System.out.print("\nLa frase non è palindroma");

        input.close();
    }
}