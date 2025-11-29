// Esercizio 3: Scrivi un programma che legge nomi da un file e li stampa in ordine alfabetico (usando array).

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class es3 {
    public static void printWordsFromFileInOrder(String fname) {
        try {
            Scanner file = new Scanner(new File(fname));
            String fileToString = "";
            String[] words;

            while (file.hasNext()) fileToString = fileToString + " " + file.next();
            words = fileToString.trim().split("[ \n]");
            Arrays.sort(words);

            for (String i : words) System.out.printf("\n%s", i);

            file.close();
        } catch (IOException e) {
            System.out.print("\nErrore nell'apertura del file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fname;

        System.out.print("\nInserisci il nome del file: ");
        fname = input.next().trim();
        
        printWordsFromFileInOrder(fname);

        input.close();
    }
}