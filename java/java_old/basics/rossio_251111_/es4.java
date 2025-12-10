// Esercizio 4: Crea un "diario digitale": l'utente inserisce testo che viene aggiunto a un file con data e ora.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.time.*;

public class es4 {
    public static void addDiaryEntry(String fname, String s) {
        try {
            FileWriter file = new FileWriter(fname, true); // Passaggio intermedio da capire
            LocalDate d = LocalDate.now();
            LocalTime t = LocalTime.now();

            file.write("\n" + d.getDayOfMonth() + "/" + d.getMonthValue() + "/" + d.getYear() +
            " alle ore " + t.getHour() + ":" + t.getMinute() + "\n");
            file.write(s);

            file.close();
        } catch (IOException e) {
            System.out.print("Errore: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void showDiary(String fname) {
        try {
            Scanner file = new Scanner(new File(fname));

            while (file.hasNextLine()) System.out.println(file.nextLine());

            file.close();
        } catch (IOException e) {
            System.out.print("Errore: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = 'a';
        String newEntry, fileName;

        System.out.printf("\nInserisci il nome del file: ");
        fileName = input.next().trim();

        do {
            try {
                System.out.print("\nIl mio diario personale");
                System.out.print("\na. Mostra annotazioni");
                System.out.print("\nb. Aggiungi annotazione");
                System.out.print("\nc. Esci");
                
                System.out.print("\nInserisci un carattere: ");
                choice = input.next().toLowerCase().charAt(0);
                input.nextLine();

                switch (choice) {
                    case 'a':
                        showDiary(fileName);
                        break;
                
                    case 'b':

                        System.out.print("\nScrivi la tua annotazione (premi INVIO per terminare): ");
                        newEntry = input.nextLine();

                        addDiaryEntry(fileName, newEntry);
                        break;
                
                    case 'c':
                        System.out.print("\nArrivederci!");
                        break;

                    default:
                        throw new InputMismatchException("\nValore non valido, riprovare");
                }

            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
            }


        } while (choice != 'c');

        input.close();
    }
}