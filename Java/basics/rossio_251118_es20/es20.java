// Scrivi un programma Java che permette di gestire una piccola playlist personale. 
// Ogni brano è descritto da: titolo, artista, durata (in minuti e secondi) e genere musicale.
// Funzioni richieste
// Aggiungi un brano (titolo, artista, durata, genere)
// Visualizza tutti i brani ordinati alfabeticamente per titolo
// Cerca brani per artista o genere
// Rimuovi un brano per titolo
// Salva playlist su file
// Carica playlist da file
// Esci
// L’array può contenere al massimo 50 brani.
// Il file di testo deve contenere una riga per brano nel formato: Titolo-Artista-Durata-Genere
// Implementare controlli di validità sugli input (durata numerica, campi non vuoti, ecc.) e gestione base delle eccezioni di input/output.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class es20 {
    public static void addSong(String[] songName, String[] songArtist, String[] songDuration, String[] songGenre, String tempName, String tempArtist, String tempDuration, String tempGenre) {
        boolean added = false;
        for (int i = 0; i < songName.length; i++) {
            if (!songName[i].isEmpty()) continue;

            songName[i] = tempName;
            songArtist[i] = tempArtist;
            songDuration[i] = tempDuration;
            songGenre[i] = tempGenre;

            added = true;
            break;
        }

        if (!added) throw new ArrayStoreException("La libreria è piena, liberare almeno uno slot prima di aggiungere altre canzoni!");
    }

    public static void showSongs(String[] songName, String[] songArtist, String[] songDuration, String[] songGenre) {
        for (int i = 0; i < songName.length; i++) {
            if (songName[i].isEmpty()) break;
            System.out.printf("\n%s-%s-%s-%s", songName[i], songArtist[i], songDuration[i]);
        }
    }

    public static int search(String[] arr, String key) {


        return -1;
    }






    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_SONGS = 50;
        String[] songName = new String[MAX_SONGS];
        String[] songArtist = new String[MAX_SONGS];
        String[] songDuration = new String[MAX_SONGS];
        String[] songGenre = new String[MAX_SONGS];

        String temp, tempName, tempArtist, tempDuration, tempGenre;

        int choice = 0;
        int index;
        char selection;

        do {
            try {
                System.out.println();
                System.out.println("1. Aggiungi un brano (titolo, artista, durata, genere)");
                System.out.println("2. Visualizza tutti i brani ordinati alfabeticamente per titolo");
                System.out.println("3. Cerca brani per artista o genere");
                System.out.println("4. Rimuovi un brano per titolo");
                System.out.println("5. Salva playlist su file");
                System.out.println("6. Carica playlist da file");
                System.out.println("7. Esci");
                System.out.print("\nInserisci un opzione: ");

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("\nInserisci il titolo della canzone: ");
                        tempName = input.nextLine().trim();
                        
                        System.out.print("\nInserisci il nome degli autori della canzone: ");
                        tempArtist = input.nextLine().trim();
                        
                        System.out.print("\nInserisci la durata della canzone: ");
                        tempDuration = input.nextLine().trim();

                        System.out.print("\nInserisci il genere della canzone: ");
                        tempGenre = input.nextLine().trim();

                        addSong(songName, songArtist, songDuration, songGenre, tempName, tempArtist, tempDuration, tempGenre);

                        break;
                    
                    case 2:
                        showSongs(songName, songArtist, songDuration, songGenre);
                        break;
                    
                    case 3:
                        System.out.print("\nRicerca per artista o genere (A/G): ");
                        selection = input.next().trim().toLowerCase().charAt(0);

                        if (selection == 'a' || selection == 'g') {
                            System.out.print("\nInserisci il nome del " + (selection == 'a' ? "l'artista: " : " genere: "));
                            temp = input.nextLine().trim();

                            index = selection == 'a' ? search(songArtist, temp) : search(songArtist, temp);
                        } else throw new InputMismatchException("Opzione non valida");



                        break;
                    case 4:
                        break;

                    default:
                        throw new InputMismatchException("Opzione non valida");
                }
                


            } catch (InputMismatchException e) {
                System.out.println("\nErrore nella lettura dell'input: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }

        } while (choice != 7);



        input.close();
    }
}