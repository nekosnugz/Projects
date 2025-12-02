// Esercizio 1: Crea un programma che legge due file di numeri e crea un terzo file con la loro unione.

import java.util.Scanner;
import java.io.*;

public class es1 {
    public static void uniteFiles(String out, String[] ins) {
        try (FileWriter toWrite = new FileWriter(out, true)) {
            for (String i : ins) {
                try (Scanner file = new Scanner(new File(i))) {
                    while (file.hasNextInt()) toWrite.write(file.nextInt() + " ");
                } catch (IOException e) {
                    System.out.print("\nErrore nella lettura del file: " + e.getMessage());
                } catch (Exception e) {
                    System.out.print("\nErrore: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.print("\nErrore nella creazione del file di output: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            
        }
    }
}