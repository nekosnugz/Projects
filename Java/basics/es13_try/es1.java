// Esercizio 1: Crea un programma che legge un numero intero e gestisce il caso in cui l'utente inserisce testo invece di un numero.

import java.util.Scanner;
import java.util.InputMismatchException;

public class es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        try {
            System.out.print("\nInserisci un numero intero: ");
            n = input.nextInt();
            System.out.printf("\nHai inserito il numero %d ", n);
        } catch (InputMismatchException e) {
            System.out.print("\nHai inserito un valore non valido");
        }

        input.close();
    }
}