import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Esercizio 1: Leggi l'età di una persona e stabilisci se è maggiorenne.
        int age;

        System.out.println("Inserisci la tua eta': ");
        age = input.nextInt();
        input.nextLine();

        if (age >= 18) {
            System.out.println("Sei maggiorenne");
        } else {
            System.out.println("Sei minorenne");
        }

        // Esercizio 2: Leggi due numeri e stampa il maggiore.
        int num1, num2;

        System.out.println("Inserisci un numero intero: ");
        num1 = input.nextInt();
        input.nextLine();

        System.out.println("Inserisci un'altro numero intero: ");
        num2 = input.nextInt();
        input.nextLine();

        System.out.println(String.format("I tuoi numeri sono '%d' e '%d'", num1, num2));

        // Esercizio 3: Leggi un voto (0-10) e stabilisci se è sufficiente (>=6) o insufficiente.
        int grade = -1;

        while (grade < -1) {
            System.out.println("Inserisci un voto da 0 a 10: ");
            grade = input.nextInt();
            input.nextLine();
            
            if (grade < 0 || grade > 10) {
                System.out.println("Numero non valido, riprovare");
                
            } else {
                if (grade >= 6) {
                    System.out.println(String.format("Il voto '%d? e' sufficiente", grade));
                } else {
                    System.out.println(String.format("Il voto '%d? e' insufficiente", grade));
                }
                break;
            }
        }

        // Esercizio 4: Leggi un numero e verifica se è pari o dispari.
        int num = 0;

        System.out.println("Inserisci un numero intero: ");
        num = input.nextInt();
        input.nextLine();

        if (num % 2 == 0) {
            System.out.println(String.format("Il numero '%d' e' pari", num));
        } else {
            System.out.println(String.format("Il numero '%d' e' dispari", num));
        }

        // Esercizio 5: Leggi tre numeri e stampa il maggiore tra i tre.
        int[] numbers = new int[3];
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("Inserisci il %d° numero intero positivo: ", i + 1));
            numbers[i] = input.nextInt();
            input.nextLine();

            if (numbers[i] < 0) {
                System.out.println("Il numero inserito non e' valido, riprovare");
                i--;
            } else {
                max = numbers[i] > max ? numbers[i] : max;
            }
        }
        
        System.out.println(String.format("Il numero maggiore tra quelli che hai inserito e' '%d'", max));


        // Esercizio 6: Leggi un anno e stabilisci se è bisestile (divisibile per 4, ma non per 100, oppure divisibile per 400)
        int year;
        
        System.out.println("Inserisci una anno: ");
        year = input.nextInt();
        input.nextLine();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(String.format("L'anno '%d' e' bisestile", year));
        } else {
            System.out.println(String.format("L'anno '%d' non e' bisestile", year));
        }

        // Esercizio 7: Leggi la temperatura e stabilisci se l'acqua è ghiaccio (<=0), liquida (0-100) o vapore (>=100).
        double temperature;

        System.out.println("Inserisci una temperatura: ");
        temperature = input.nextDouble();
        input.nextLine();

        if (temperature <= 0.0f) {
            System.out.println(String.format("L'acqua, alla temperatura di %.1f°C, si trova allo stato solido", temperature));
        } else if (temperature < 100.0f) { // temperature > 0.0f omesso perche' sicuramente gia' verificato
            System.out.println(String.format("L'acqua, alla temperatura di %.1f°C, si trova allo stato liquido", temperature));
        } else {
            System.out.println(String.format("L'acqua, alla temperatura di %.1f°C, si trova allo stato gassoso/aeriforme", temperature));
        }

        // Esercizio 8: Leggi username e password. Se username è "admin" e password è "1234", stampa "Accesso consentito", altrimenti "Accesso negato".
        String username, password;

        do {
            System.out.println("Inserisci il nome utente: ");
            username = input.next();
            input.nextLine();

            System.out.println("Inserisci la tua password: ");
            password = input.next();
            input.nextLine();

            if (username.equals("admin") && password.equals("1234")) {
                System.out.println("Accesso consentito :D");
            } else {
                System.out.println("Accesso negato D:");
            }
        } while (!username.equals("admin") || !password.equals("1234"));

        // Esercizio 9: Calcola il prezzo del biglietto del cinema: bambini (0-12) = 5€, studenti (13-25) = 8€, adulti (26-65) = 12€, anziani (65+) = 6€.
        // int age; -> omesso perche' gia' dichiarato
        int ticketPrice;
        do {
            System.out.println("Inserisci la tua eta': ");
            age = input.nextInt();
            input.nextLine();

            if (age < 0) System.out.println("Eta' non valida, riprovare");
        } while (age < 0);

        if (age < 12) {
            ticketPrice = 5;

        } else if (age < 25) {
            ticketPrice = 8;

        } else if (age < 65) {
            ticketPrice = 12;
            
        } else {
            ticketPrice = 6;
        }

        System.out.println(String.format("Il tuo biglietto costera' %d euro", ticketPrice));

        input.close();
    }
}