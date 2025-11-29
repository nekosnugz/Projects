// Esercizio 6: Crea un programma che legge una password e verifica se contiene almeno una lettera maiuscola, una minuscola e un numero.
import java.util.Scanner;

public class es6 {

    public static boolean isPasswordValid(String s) {
        String req1 = "1234567890";
        String req2 = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String req3 = "qwertyuiopasdfghjklzxcvbnm";

        boolean req1met = false;
        boolean req2met = false;
        boolean req3met = false;


        for (int i = 0; i < s.length(); i++) {
            if (!req1met && req1.indexOf(s.charAt(i)) != -1) req1met = true;
            if (!req2met && req2.indexOf(s.charAt(i)) != -1) req2met = true;
            if (!req3met && req3.indexOf(s.charAt(i)) != -1) req3met = true;
        }

        return req1met && req2met && req3met;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        boolean isPasswordOk;

        System.out.print("\nInserisci una password: ");
        password = input.nextLine();

        isPasswordOk = isPasswordValid(password);

        if (isPasswordOk) System.out.println("La password rispetta i criteri di sicurezza");
        else System.out.println("La password NON rispetta i criteri di sicurezza");

        input.close();
    }
}