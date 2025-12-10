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
    public static void addSong(String[] songName, String[] songArtist, String[] songDuration, String[] songGenre, String tempName, String tempArtist, String tempDuration, String tempGenre) throws ArrayStoreException {
        boolean added = false;
        for (int i = 0; i < songName.length; i++) {
            if (songName[i] != null && !songName[i].isEmpty()) continue;

            songName[i] = tempName.replace("-", "_");
            songArtist[i] = tempArtist.replace("-", "_");
            songDuration[i] = tempDuration.replace("-", "_");
            songGenre[i] = tempGenre.replace("-", "_");

            added = true;
            break;
        }

        if (!added) throw new ArrayStoreException("La playlist è piena, liberare almeno uno slot prima di aggiungere altre canzoni!");
    }

    public static void showSongs(String[] songName, String[] songArtist, String[] songDuration, String[] songGenre) {
        int[] index = new int[songName.length];
        for (int i = 0; i < index.length; i++) index[i] = i;
        
        for (int i = 0; i < songName.length; i++) {
            for (int j = 0; j < songName.length - 1- i; j++) {
                if (songName[index[j]] != null && songName[index[j+1]] != null && songName[j].compareTo(songName[index[j+1]]) > 0) {
                    int temp = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp;
                }
            }
        }

        System.out.println();
        for (int i : index) {
            System.out.printf("%s-%s-%s-%s\n", songName[i], songArtist[i], songDuration[i], songGenre[i]);
        }

    }

    public static int[] search(String[] arr, String key) {
        int[] res;
        int j = 0, qty = 0;
        
        for (int i = 0; i < arr.length; i++) if (arr[i].equals(key)) qty++;

        if (qty == 0) return new int[]{-1};
        res = new int[qty];
        res[0] = -1;

        for (int i = 0; i < arr.length; i++) if (arr[i].equals(key)) res[j++] = i;

        return res;
    }

    public static void removeSong(String tempName, String[] songName, String[] songArtist, String[] songDuration, String[] songGenre) throws Exception { // Mettendo throws Exception alla fine si dice al compilatore che la funzione può restituire eccezioni
        boolean wasSongPresent = false;
        for (int i = 0; i < songName.length; i++) {
            if (songName[i].equals(tempName)) {
                songName[i] = null;
                songArtist[i] = null;
                songDuration[i] =null;
                songGenre[i] = null;

                wasSongPresent = true;
                break;
            }
        }

        if (!wasSongPresent) throw new Exception("La canzone non esiste nella playlist");
    }

    public static void savePlaylist(String filename, String[] songName, String[] songArtist, String[] songDuration, String[] songGenre) {
        try (FileWriter file = new FileWriter(new File(filename), false)) {
            for (int i = 0; i < songName.length; i++) {
                if (songName[i] != null) file.write(String.format("%s-%s-%s-%s\n", songName[i], songArtist[i], songDuration[i], songGenre[i]));
            }
        } catch (IOException e) {
            System.out.print("\nErrore nel salvataggio della playlist: " + e.getMessage());
        }
    }
    
    public static void loadPlaylist(String filename, String[] songName, String[] songArtist, String[] songDuration, String[] songGenre) {
        try (Scanner file = new Scanner(new File(filename))) {
            int i = 0;
            int max = songName.length;
            while (file.hasNextLine()) {
                String[] song = file.nextLine().trim().split("-");

                if (i == max) break;
                if (song.length != 4) throw new InputMismatchException("Il file fornito non e' ben formattato");
                
                songName[i] = song[0];
                songArtist[i] = song[1];
                songDuration[i] = song[2];
                songGenre[i++] = song[3];
            }

        } catch (IOException e) {
            System.out.print("\nErrore nel caricamento della playlist: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("\nErrore nell'accesso all'array: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.print("\nErrore nella lettura della playlist: " + e.getMessage());
        } catch (Exception e) {
            System.out.print("\nErrore: " + e.getMessage());
        }
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
        int[] indexes = new int[]{-1};
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
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("\nInserisci il titolo della canzone: ");
                        tempName = input.nextLine().trim();

                        if (tempName == null || tempName.isEmpty()) throw new InputMismatchException();
                        
                        System.out.print("\nInserisci il nome degli autori della canzone: ");
                        tempArtist = input.nextLine().trim();
                        if (tempArtist == null || tempArtist.isEmpty()) throw new InputMismatchException();
                        
                        System.out.print("\nInserisci la durata della canzone: ");
                        tempDuration = input.nextLine().trim();
                        if (tempDuration == null || tempDuration.isEmpty()) throw new InputMismatchException();
                        
                        System.out.print("\nInserisci il genere della canzone: ");
                        tempGenre = input.nextLine().trim();
                        if (tempGenre == null || tempGenre.isEmpty()) throw new InputMismatchException();

                        addSong(songName, songArtist, songDuration, songGenre, tempName, tempArtist, tempDuration, tempGenre);

                        break;
                    
                    case 2:
                        showSongs(songName, songArtist, songDuration, songGenre);
                        break;
                    
                    case 3:
                        System.out.print("\nRicerca per artista o genere (A/G): ");
                        selection = input.nextLine().trim().toLowerCase().charAt(0);

                        if (selection == 'a' || selection == 'g') {
                            System.out.print("\nInserisci il nome del " + (selection == 'a' ? "l'artista: " : " genere: "));
                            temp = input.nextLine().trim();

                            if (selection == 'a') indexes = search(songArtist, temp);
                            else if (selection == 'g') indexes = search(songGenre, temp);
                        } else throw new InputMismatchException("Opzione non valida");

                        for (int i : indexes) {
                            if (i != -1) System.out.printf("\n%s-%s-%s-%s", songName[i], songArtist[i], songDuration[i], songGenre[i]);
                        }

                        break;
                    case 4:
                        System.out.print("\nInserisci il titolo della canzone da rimuovere: ");
                        tempName = input.nextLine().trim();

                        removeSong(tempName, songName, songArtist, songDuration, songGenre);
                        break;

                    case 5:
                        System.out.print("\nInserisci il nomer del file: ");
                        temp = input.next().trim();
                        input.nextLine();

                        savePlaylist(temp, songName, songArtist, songDuration, songGenre);
                        
                        break;
                        
                    case 6:
                        System.out.print("\nInserisci il nomer del file: ");
                        temp = input.next().trim();
                        input.nextLine();

                        loadPlaylist(temp, songName, songArtist, songDuration, songGenre);
                        break;
                    
                    case 7:
                        System.out.print("\nArrivederci\n");
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