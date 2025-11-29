// Esercizio 9: 
import java.util.Scanner;

public class es9 {

    public static void leggiCodiceFiscale(String s) {

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String codice;

        System.out.print("\nInserisci una frase: ");
        codice = input.nextLine();

        leggiCodiceFiscale(codice);

        input.close();
    }
}