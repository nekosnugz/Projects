// Esercizio 10: Crea un semplice "database" studenti: salva e carica informazioni studente (nome, età, voti) da file.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class es10 {
    public static void saveStudents(String fname, String[] n, int[] a, int[][] m) {
        try (FileWriter file = new FileWriter(new File(fname), false)) {
            if (m.length != a.length || a.length != n.length) throw new InputMismatchException("La lunghezza dei parametri non coincide");
            file.write(n.length + " " + m[0].length + "\n"); // Prima linea di controllo per lettura corretta
            for (int i = 0; i < n.length; i++) {
                file.write(n[i] + ", " + a[i] + ", ");
                for (int j = 0; j < m[i].length; j++) file.write(m[i][j] + "-");
                file.write("\n");
            }
        } catch (IOException e) {
            System.out.print("\nErrore nel salvataggio: " + e.getMessage());
        }  catch (Exception e) {
            System.out.print("\nErrore: " + e.getMessage());
        }
    }

    public static void loadStudents(String fname, String[] n, int[] a, int[][] m) {
        String[] names;
        int[] ages;
        int[][] marks;
        int i = 0, j = 0;

        try (Scanner file = new Scanner(new File(fname))) {
            if (file.hasNextLine()) {
                names = new String[file.nextInt()];
                ages = new int[names.length];
                marks = new int[names.length][file.nextInt()];

                while (file.hasNextLine()) {
                    names[i] = file.next().trim();
                    ages[i] = Integer.parseInt(file.next().trim().replace(",", ""));
                    String[] temp = file.nextLine().trim().split("[-]");

                    j = 0;
                    for (String k : temp) marks[i][j++] = Integer.parseInt(k);
                }
            } else throw new IOException("File vuoto");

        } catch (IOException e) {
            System.out.print("\nErrore nella lettura del file: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("\nErrore: " + e.getMessage());
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        String filename = "output10.txt";
        String[] names = new String[] {"Carlo", "Giovanni", "Piero"};
        int[] ages = new int[] {16, 17, 17};
        int[][] marks = new int[][] {
            {7, 8, 8 ,7 ,9},
            {5, 8, 7, 6, 7},
            {6, 7, 8, 7, 10},
        };

        saveStudents(filename, names, ages, marks);
        loadStudents(filename, names, ages, marks);

    }
}