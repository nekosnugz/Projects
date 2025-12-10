// Esercizio 2: Scrivi un metodo che converte una stringa in numero e gestisce la conversione non valida restituendo -1.
import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        int n;

        System.out.print("\nInserisci una stringa che contenga un numero intero: ");
        s = input.next();
        
        try {            
            n = Integer.parseInt(s);

            System.out.print("\nConversione eseguita con successo");
        } catch (NumberFormatException e) {
            System.out.print("\nConversione fallita, la stringa non si puo' convertire in intero");
            n = -1;
        }

        System.out.printf("\nStringa: %s", s);
        System.out.printf("\nIntero da stringa: %d", n);

        input.close();
    }
}