// Esercizio 2:  Crea un programma che legge numeri da un file e calcola la loro somma e media.
import java.util.Scanner;
import java.io.*;

public class es2 {
    public static double getSum(String fname) {
        double sum = -1;
        try {
            Scanner file = new Scanner(new File(fname));
            for (sum = 0; file.hasNextDouble(); sum++) sum += file.nextDouble();
            file.close();
        } catch (IOException e) {
            System.out.print("\nErrore nella lettura del file: " + e.getMessage());
        }
        return sum;
    }
    
    public static double getAvrg(String fname) {
        double avrg = -1;
        int count = 1;
        try {
            Scanner file = new Scanner(new File(fname));
            for (count = 0; file.hasNextDouble(); count++) avrg += file.nextDouble();
            file.close();
        } catch (IOException e) {
            System.out.print("\nErrore nella lettura del file: " + e.getMessage());
        }
        
        return avrg / count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum, avrg;
        String fname;

        System.out.print("\nInserisci il nome del file: ");
        fname = input.nextLine().trim();

        sum = getSum(fname);
        avrg = getAvrg(fname);

        System.out.print(sum != -1 ? "\nSomma dei numeri: %.2f" + sum : "\nImpossibile calcolare la somma");
        System.out.print(avrg != -1 ? "\nMedia dei numeri: %.2f" + avrg : "\nImpossibile calcolare la media");
        
        input.close();
    }
}