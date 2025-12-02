// Esercizio 6: Crea un programma per gestire i voti di una classe.
// Usa un array per i nomi degli studenti e un altro per i voti.
// Implementa metodi per: calcolare la media della classe, trovare il voto più alto e più basso,
// contare quanti studenti sono stati promossi (voto ≥ 6).
import java.util.Scanner;

public class es1 {
    public static int minMark(double[] a) {
        int min = 0;
        
        for (int i = 1; i < a.length; i++) {
            if (a[min] < a[i]) min = i;
        }

        return min;
    }

    public static int maxMark(double[] a) {
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[max] > a[i]) max = i;
        }
        return max;
    }

    public static double avrgMark(double[] a) {
        double avrg = 0;
        for (double i : a) avrg += i;
        return avrg / a.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names;
        double[] marks;
        int students, promoted, min, max;
        double avrg;

        System.out.print("\nInserisci il numero di alunni: ");
        students = input.nextInt();
        input.nextLine();
        
        names = new String[students];
        marks = new double[students];

        for (int i = 0; i < students; i++) {
            System.out.printf("\nInserisci il nome del %d° alunno: ", i+1);
            names[i] = input.nextLine();
            
            System.out.printf("\nInserisci il voto del %d° alunno: ", i+1);
            marks[i] = input.nextInt();
        }

        min = minMark(marks);
        max = maxMark(marks);
        avrg = avrgMark(marks);


        System.out.printf("\nVoto minimo    : %1.2f\nAlunno: %s", marks[min]);
        System.out.printf("\nVoto massimo   : %1.2f", max);
        System.out.printf("\nMedia voti     : %1.2f", avrg);

        input.close();
    }
}