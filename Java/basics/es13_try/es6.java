// Esercizio 6: Scrivi un programma di login che continua finché non si inseriscono credenziali valide, gestendo input vuoti.

import java.util.Scanner;

public class es6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;


        try {
            System.out.print("\nUsername: ");
            username = input.next();
            input.nextLine();

            if (username.length() == 0) throw new Exception("Username non valido");
    
            System.out.print("\nPassword: ");
            password = input.next();
            input.nextLine();            
            
            if (password.length() == 0) throw new Exception("Password non valida");
        
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            input.close();
        }
    }
}