// Esercizio 9B: calcolo frequenze lettere in una frase

import java.util.Scanner;

public class es9b {
    public static int[] countFrequencyChars(String s, String alfa) {
        int[] freq = new int[alfa.length()];
        for (int i = 0; i < s.length(); i++) {
            freq[i] = 0;
            for (int j = 0; j < alfa.length(); j++) {
                // if (s.charAt(i) == alfa.charAt(j)) 
                if (s.charAt(i) == alfa.charAt(j)) {
                    freq[j]++;
                    break;
                }
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] frequency;

        System.out.print("\nInserisci una frase: ");
        sentence = input.nextLine();

        frequency = countFrequencyChars(sentence, alphabet);

        System.out.printf("\nOccorrenze dei caratteri");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.printf("\n%c : %d", alphabet.charAt(i), frequency[i]);
            }
        }

        input.close();
    }
}