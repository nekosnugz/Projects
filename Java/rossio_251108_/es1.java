// Esercizio 1: Scrivi un programma che crea un file di testo con i numeri da 1 a 10, uno per riga.

import java.io.*;

public class es1 {
    public static void print10(String fname) {
        try {
            PrintWriter file = new PrintWriter(fname);

            for (int i = 1; i <= 10; i++) file.print(i);

            file.close();
        } catch (IOException e) {
            System.out.println("Errore nella scrittura su file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        print10("out1.txt");
    }
}