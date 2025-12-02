import java.util.Scanner;
import java.io.*;

public class save_load {
    public static void save(String filename, String[] a1, String[] a2, String[] a3) {
        try (FileWriter file = new FileWriter(new File(filename), false)) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] == null || a2[i] == null || a3[i] == null) break;
                file.append(a1[i] + "-" + a2[i] + "-" + a3[i] + "\n");
            }

        } catch (IOException e) {
            System.out.println("\nErrore nella lettura del file: " + e.getMessage());
        }
    }

    public static void load(String filename, String[] a1, String[] a2, String[] a3) {
        int count = 0;
        try (Scanner file = new Scanner(new File(filename))) {
            while (file.hasNextLine()) {
                String[] temp = file.nextLine().trim().split("-");
                if (temp.length != 3) throw new IOException("Il file non è stato formattato correttamente");
                a1[count] = temp[0];
                a2[count] = temp[1];
                a3[count] = temp[2];
            }

        } catch (IOException e) {
            System.out.println("\nErrore nella lettura del file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nErrore: " + e.getMessage());
        }

    }


    public static void main(String[] args) {
        String[] arr1, arr2, arr3, new1, new2, new3;
        final int MAX_SIZE = 9;

        arr1 = new String[MAX_SIZE];
        arr2 = new String[MAX_SIZE];
        arr3 = new String[MAX_SIZE];

        new1 = new String[MAX_SIZE];
        new2 = new String[MAX_SIZE];
        new3 = new String[MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            arr1[i] = "Argomento 1: " + i;
            arr2[i] = "Argomento 2: " + i;
            arr3[i] = "Argomento 3: " + i;
        }

        save("save1.txt", arr1, arr2, arr3);
        load("save1.txt", new1, new2, new3);

        System.out.println("\nArray iniziale in memoria:");
        for (String i : arr1) System.out.print(i + " ");

        System.out.println("\nArray caricato in memoria:");
        for (String i : arr1) System.out.print(i + " ");


    }
}