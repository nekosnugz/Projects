// Esercizio 10: Crea un metodo che formatta un numero di telefono: da "3401234567" a "340-123-4567".
import java.util.Scanner;

public class es10 {

    public static String formatPhoneNumber(String n) {
        String out = "";
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 6) out += "-";
            out += n.charAt(i);
            System.out.println(out);
        }
        
        System.out.print(out);

        return out;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String phoneNum;
        String formatted;

        System.out.print("\nInserisci il tuo numero di telefono: ");
        phoneNum = input.nextLine();

        formatted = formatPhoneNumber(phoneNum);

        System.out.printf("\nNumero di telefono formattato: %s", formatted);

        input.close();
    }
}