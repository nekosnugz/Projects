// Esercizio 5: Scrivi un programma che implementi il cifrario di Cesare.
// Crea un metodo per cifrare un testo spostando ogni lettera di un numero
// fisso di posizioni nell'alfabeto e un altro metodo per decifrare.
import java.util.Scanner;

public class es5 {
    public static char cipherCaesarLetter(char l, int n) {
        int ciphered = (int) l;
        int key = n % 26;

        if (key == 0) return l;
        else if (l >= 'a' && l <= 'z') {
            if ((char) ciphered + key < 'a') {
                ciphered = 'z' - (ciphered + key - 'a');
            } else if ((char) ciphered + key > 'z') {
                ciphered = 'a' + ('z' - (ciphered + key));
            } else ciphered += key;
        } else if (l >= 'A' && l <= 'Z') {
            if ((char) ciphered + key < 'A') {
                ciphered = 'Z' - (ciphered + key - 'A');
            } else if ((char) ciphered + key > 'Z') {
                ciphered = 'A' + ('Z' - (ciphered + key));
            } else ciphered += key;
        } else return l;
        
        return (char) ciphered;
    }

    public static String cipherCaesarString(String s, int n) {
        String ciphered = "";

        for (int i = 0; i < s.length(); i++) ciphered += cipherCaesarLetter(s.charAt(i), n);

        return ciphered;
    }

    public static char decipherCaesarLetter(char l, int n) {
        int ciphered = (int) l;
        int key = n % 26 - 25;
        cipherCaesarLetter(l, -key);

        return (char) ciphered;
    }

    public static String decipherCaesarString(String s, int n) {
        String ciphered = "";

        for (int i = 0; i < s.length(); i++) ciphered += decipherCaesarLetter(s.charAt(i), n);

        return ciphered;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase, ciphered, deciphered;
        int num;
        
        System.out.print("\nInserisci una frase: ");
        phrase = input.nextLine();
        
        System.out.print("\nInserisci la chiave di cifratura (numero intero): ");
        num = input.nextInt();

        ciphered = cipherCaesarString(phrase, num);
        deciphered = decipherCaesarString(phrase, num);

        System.out.printf("\nFrase originale: %s", phrase);
        System.out.printf("\nFrase cifrata  : %s", ciphered);
        System.out.printf("\nFrase decifrata: %s", deciphered);

        input.close();
    }
}