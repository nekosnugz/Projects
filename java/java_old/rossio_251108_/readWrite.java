import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class readWrite {
    public static void randomWrite(String fname, int qty, int bound) {
        try {
            PrintWriter file = new PrintWriter(fname);
            Random r = new Random();

            for (int i = 0; i < qty; i++) file.println(r.nextInt(bound));

            file.close();
        } catch (IOException e) {
            System.out.print("\nErrore nell'apertura del file: " + e.getMessage());
        }
    }

    public static double getAverage(String fname) {
        int count, num;
        double avrg = -1;

        try {
            Scanner file = new Scanner(new File(fname));
            avrg = 0;
            
            for (count = 0; file.hasNextInt(); count++) {
                num = file.nextInt();
                avrg += num;
                System.out.printf("\nRead: %5d", num);
            }

            avrg /= count;

            file.close();

            return avrg;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return avrg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fname = "out";
        int qty = 0;
        int bound = 0;
        boolean fnameOK = false;
        boolean qtyOK = false;
        boolean boundOK = false;
        double average;

        do {
            try {
                if (!fnameOK) {
                    System.out.print("\nInserisci il nome del file: ");
                    fname = input.nextLine();
                    fnameOK = true;
                }
                
                if (!qtyOK) {
                    System.out.print("\nInserisci quanti interi vuoi generare: ");
                    qty = input.nextInt();
                    input.nextLine();
                    qtyOK = true;
                }

                if (!boundOK) {
                    System.out.print("\nInserisci il valore massimo: ");
                    bound = input.nextInt() + 1;
                    input.nextLine();
                    boundOK = true;
                }

            } catch (InputMismatchException e) {
                System.out.print("\nL'input non combacia con la richiesta");
            }
        } while (!fnameOK && !qtyOK && !boundOK);

        if (!fname.endsWith(".txt")) fname = fname + ".txt";

        randomWrite(fname, qty, bound);
        average = getAverage(fname);

        System.out.print(average != -1 ? "\nMedia dei numeri: " + average : "Errore nella lettura del file");

        input.close();
    }
}
