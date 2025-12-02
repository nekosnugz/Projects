import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class verifica {
    // Funziona
    public static void caricaRubrica(String filename, String[] nome, String[] cognome, String[] numeroTelefono, int[] nChiamate) {
        String[] tempNome = new String[nome.length];
        String[] tempCognome = new String[nome.length];
        String[] tempNumeroTel = new String[nome.length];
        int[] tempNChiamate = new int[nome.length];

        int index = 0;

        try (Scanner file = new Scanner(new File(filename))) {
            while (file.hasNextLine()) {
                String[] lettura = file.nextLine().trim().split("-");
                if (lettura.length != 4) throw new IOException("File non formattato bene");
                if (lettura[0] == null || lettura[1] == null || lettura[2] == null || lettura[3] == null) break;
                
                tempNome[index] = lettura[0];
                tempCognome[index] = lettura[1];
                tempNumeroTel[index] = lettura[2];
                tempNChiamate[index++] = Integer.parseInt(lettura[3]);
            }

            nome = tempNome;
            cognome = tempCognome;
            numeroTelefono = tempNumeroTel;
            nChiamate = tempNChiamate;

        } catch (IOException e) {
            System.out.println("Errore nella lettura del file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore : " + e.getMessage());
        }

    }

    // Funziona
    public static void mostraContatti(String[] nome, String[] cognome, String[] numeroTelefono, int[] nChiamate) {
        int[] indices = new int[nome.length];

        for (int i = 0; i < indices.length; i++) indices[i] = i;

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length - 1 - i; j++) {
                if (cognome[j+1] == null) break;
                if (cognome[j].compareToIgnoreCase(cognome[j+1]) > 0) {
                    int temp = indices[j];
                    indices[j] = indices[j+1];
                    indices[j+1] = temp;
                }
            }
        }

        System.out.println();
        for (int i : indices) {
            if (nome[i] == null) break;
            
            System.out.printf("Cognome: %s\n", cognome[i]);
            System.out.printf("Nome: %s\n", nome[i]);
            System.out.printf("Numero di telefono: %s\n", numeroTelefono[i]);
            System.out.printf("Chiamate effettuate: %d\n\n", nChiamate[i]);
        }
    }

    // Funziona
    public static void aggiungiContatto(String temp1, String temp2, String temp3, int tempInt, String[] nome, String[] cognome, String[] numeroTelefono, int[] nChiamate) throws Exception {
        int index = -1;

        for (int i = 0; i < nome.length; i++) {
            if (nome[i] == null) {
                index = i;
                break;
            }
        }

        if (index == -1) throw new Exception("Impossibile aggiungere un nuovo contatto, numero massimo di contatti raggiunto");

        nome[index] = temp1;
        cognome[index] = temp2;
        numeroTelefono[index] = temp3;
        nChiamate[index] = tempInt;

    }

    // Funziona
    public static void cercaContatto(Scanner input, String temp2, String[] nome, String[] cognome, String[] numeroTelefono, int[] nChiamate) {
        try {
            char c;
            for (int i = 0; i < nome.length; i++) {
                if (temp2.equalsIgnoreCase(cognome[i])) {
                    System.out.printf("Cognome: %s\n", cognome[i]);
                    System.out.printf("Nome: %s\n", nome[i]);
                    System.out.printf("Numero di telefono: %s\n", numeroTelefono[i]);
                    System.out.printf("Chiamate effettuate: %d\n\n", nChiamate[i]);
                    System.out.print("\nVuoi chiamare questo contatto? (y/N) ");

                    c = input.nextLine().toLowerCase().charAt(0);
                    if (c == 'y') chiama(i, nChiamate);
                }
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
     }

    // Funziona
    public static void elimina(String deleteNum, String[] nome, String[] cognome, String[] numeroTelefono, int[] nChiamate) throws Exception{
        boolean eliminato = false;
        
        for (int i = 0; i < nome.length; i++) {
            if (numeroTelefono[i] != null && deleteNum.equalsIgnoreCase(numeroTelefono[i])) {
                for (int j = i; j < nome.length - 1; j++) {
                    String temp = nome[j];
                    nome[j]= nome[j+1];
                    nome[j+1] = temp;

                    temp = cognome[j];
                    cognome[j]= cognome[j+1];
                    cognome[j+1] = temp;

                    temp = numeroTelefono[j];
                    numeroTelefono[j]= numeroTelefono[j+1];
                    numeroTelefono[j+1] = temp;

                    int tempN = nChiamate[j];
                    nChiamate[j]= nChiamate[j+1];
                    nChiamate[j+1] = tempN;
                    eliminato = true;
                }

                System.out.print("\nContatto eliminato");
                break;
            }
        }
        
        if (!eliminato) throw new Exception("Contatto non trovato");
    }

    // Funziona
    public static void azzeraRubrica(String[] nome, String[] cognome, String[] numeroTelefono, int[] nChiamate) {
        nome[0] = "Emergenza";
        cognome[0] = "Emergenza";
        numeroTelefono[0] = "112";
        nChiamate[0] = 0;

        for (int i = 1; i < nome.length; i++) {
            nome[i] = null;
            cognome[i] = null;
            numeroTelefono[i] = null;
            nChiamate[i] = 0;
        }
    }

    // Funziona
    public static void salvaRubrica(String filename, String[] nome, String[] cognome, String[] numeroTelefono, int[] nChiamate) {
        try (FileWriter file = new FileWriter(new File(filename), false)) {
            for (int i = 0; i < nome.length; i++) {
                if (nome[i] == null || cognome[i] == null || numeroTelefono[i] == null || nChiamate[i] < 0) break;
                file.append(String.format("%s-%s-%s-%s\n", nome[i], cognome[i], numeroTelefono[i], nChiamate[i]));
            }
            System.out.print("\nSalvataggio completato");
        } catch (IOException e) {
            System.out.println("Errore nel salvataggio del file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void chiama(int pos, int[] nChiamate) {
        nChiamate[pos]++;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int MAX_CONTATTI = 30;
        final String NOME_FILE = "rubrica.txt";
        String[] nome = new String[MAX_CONTATTI];
        String[] cognome = new String[MAX_CONTATTI];
        String[] numeroTelefono = new String[MAX_CONTATTI];
        int[] nChiamate = new int[MAX_CONTATTI];

        int choice = 0;
        int tempInt;
        String temp1, temp2, temp3;
        char init;

        // Caricamento della rubrica iniziale non funziona
        System.out.print("\nVuoi caricare una rubrica? (y/N) ");
        init = input.nextLine().toLowerCase().charAt(0);

        if (init == 'y') {
            caricaRubrica(NOME_FILE, nome, cognome, numeroTelefono, nChiamate);
            System.out.println("Rubrica caricata");
        }

        while (choice != 8) {
            try {
                System.out.print("\n\nRubrica telefonica"); 
                System.out.print("\n1. Carica rubrica da file"); 
                System.out.print("\n2. Visualzza contatti ordinati per cognome"); 
                System.out.print("\n3. Aggiungi un contatto alla rubrica (in memoria)"); 
                System.out.print("\n4. Ricerca contatti per cognome"); 
                System.out.print("\n5. Cancella un contatto per telefono"); 
                System.out.print("\n6. Azzera rubrica"); 
                System.out.print("\n7. Salva rubrica su file"); 
                System.out.print("\n8. Esci"); 
                System.out.print("\nSeleziona un'opzione: ");

                choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        caricaRubrica(NOME_FILE, nome, cognome, numeroTelefono, nChiamate);
                        break;

                    case 2:
                        mostraContatti(nome, cognome, numeroTelefono, nChiamate);
                        break;

                    case 3:
                        System.out.print("\nInserisci il nome del contatto (NO carattere '-'): ");
                        temp1 = input.nextLine().trim();
                        
                        if (temp1.contains("-") || temp1.isEmpty()) throw new InputMismatchException("Nome non valido");
                        
                        System.out.print("\nInserisci il cognome del contatto (NO carattere '-'): ");
                        temp2 = input.nextLine().trim();
                        
                        if (temp2.contains("-") || temp2.isEmpty()) throw new InputMismatchException("Cognome non valido");
                        
                        System.out.print("\nInserisci il numero di telefono del contatto (NO carattere '-'): ");
                        temp3 = input.nextLine().trim();
                        
                        if (temp3.contains("-") || temp3.isEmpty()) throw new InputMismatchException("Numero di telefono non valido");

                        System.out.print("\nInserisci il numero di chiamate fatte verso questo contatto: ");
                        tempInt = input.nextInt();
                        input.nextLine();

                        if (tempInt < 0) throw new InputMismatchException("Il numero delle chiamate deve essere maggiore o uguale a 0");

                        aggiungiContatto(temp1, temp2, temp3, tempInt, nome, cognome, numeroTelefono, nChiamate);

                        break;

                    case 4:
                        System.out.print("\nInserisci il nome del cognome da cercare (NO carattere '-'): ");
                        temp2 = input.nextLine().trim();

                        if (temp2.contains("-") || temp2.isEmpty()) throw new InputMismatchException("Cognome non valido");

                        cercaContatto(input, temp2, nome, cognome, numeroTelefono, nChiamate);
                        break;

                    case 5:
                        System.out.print("\nInserisci il numero di telefono del contatto da eliminare: ");
                        temp3 = input.nextLine().trim();

                        elimina(temp3, nome, cognome, numeroTelefono, nChiamate);

                        break;

                    case 6:
                        azzeraRubrica(nome, cognome, numeroTelefono, nChiamate);
                        break;

                    case 7:
                        System.out.print("\nATTENZIONE: se è presente una rubrica vecchia, essa verrà eliminata. Continuare? (y/N)");
                        init = input.nextLine().trim().toLowerCase().charAt(0);

                        if (init == 'y') salvaRubrica(NOME_FILE, nome, cognome, numeroTelefono, nChiamate);
                        else System.out.print("\nSalvataggio rubrica interrotto");

                        break;

                    case 8:
                        System.out.print("\nArrivederci!");
                        break;                    

                    default:
                        throw new InputMismatchException("Opzione non valida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Errore nella lettura dell'input : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore : " + e.getMessage());
                System.out.println("Premi invio per continuare...");
                input.nextLine();
            }
        }


        input.close();
    }
}