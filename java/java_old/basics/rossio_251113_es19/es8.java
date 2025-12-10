// Esercizio 8: Crea un programma che conta le parole in un file di testo e salva il risultato in un altro file.

import java.util.Scanner;
import java.io.*;

public class es8 {
    public static void countWords(String input, String output) {
        try (Scanner in = new Scanner(new File(input))) {
            int i = 0;
            while (in.hasNext()) {
                in.next();
                i++;
            }
            try (FileWriter out = new FileWriter(new File(output), false)) {
                System.out.println(i);
                out.write("" + i);
                out.close();
            } catch (IOException e) {
                System.out.print("\nErrore nel salvataggio: " + e.getMessage());
            } catch (Exception e) {
                System.out.print("\nErrore: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.print("\nErrore nell'apertura del file: " + e.getMessage());
        } catch (Exception e) {
            System.out.print("\nErrore: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        countWords("input8.txt", "output8.txt");
    }
}