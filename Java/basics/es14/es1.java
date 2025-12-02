// Esercizio 1
// Crea un metodo che legga una password e verifichi se
// 1. contiene almeno 8 caratteri
// 2. contiene almeno una lettera maiuscola,
// 3. contiene almeno una minuscola
// 4. contiene almeno un numero.
// 5. contiene almeno un carattere speciale tra "!@-_&%$"

// true se corretto/false non corretto

import java.util.InputMismatchException;
import java.util.Scanner;

public class es1 {
    public static boolean checkPassword(String p) {
        final String SPECIAL = "!@-_&%$";
        String errors = "\nErrori:\n";
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        try {
            if (p.contains(" ")) throw new InputMismatchException("La password non può contenere spazi");
            if (p.length() < 8) throw new InputMismatchException("La password deve avere almeno 8 caratteri");

            for (int i = 0; i < p.length(); i++) {
                hasUpper    = !hasUpper   && (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') ? true : hasUpper;
                hasLower    = !hasLower   && (p.charAt(i) >= 'a' && p.charAt(i) <= 'z') ? true : hasLower;
                hasNumber   = !hasNumber  && (p.charAt(i) >= '0' && p.charAt(i) <= '9') ? true : hasNumber;

                for (int j = 0; !hasSpecial && j < SPECIAL.length(); j++) {
                    hasSpecial = (p.charAt(i) == SPECIAL.charAt(j)) ? true : hasSpecial;
                }
            }

            if (hasUpper && hasLower && hasNumber && hasSpecial) return true;

            if (!hasUpper) errors = errors + "La password deve contenere almeno una lettera maiuscola\n";
            if (!hasLower) errors = errors + "La password deve contenere almeno una lettera minuscola\n";
            if (!hasNumber) errors = errors + "La password deve contenere almeno un numero\n";
            if (!hasSpecial) errors = errors + "La password deve contenere almeno un carattere speciale (" + SPECIAL + ")";

            throw new InputMismatchException(errors);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean auth(String u, String p) {
        return u == "Admin" && p == "Password1&"  ? true : false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        boolean isValid;
        final int MAX_TRIES = 7;
        int tries = 0;

        do {
            System.out.print("\nUsername: ");
            username = input.nextLine();

            System.out.print("\nInserisci la password: ");
            password = input.nextLine();

            isValid = checkPassword(password);

            // System.out.println(isValid);
            // System.out.print(isValid ? "\nLa password è valida" : "\nLa password non è valida");

            if (isValid) {
                if (auth(username, password)) {
                    System.out.println("Accesso garantito");
                    break;
                } else {
                    tries++;
                    System.out.printf("\nCredenziali errate. Tentativi rimasti: %d", MAX_TRIES - tries);
                }
            } else {
                tries++;
                System.out.printf("\nLa password non è valida. Tentativi rimasti: %d", MAX_TRIES - tries);
            }

        } while (tries < MAX_TRIES);

        if (tries == MAX_TRIES) System.out.println("Accesso negato");

        input.close();
    }
}