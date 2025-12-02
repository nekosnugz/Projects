// Esercizio 9: Scrivi un "backup" di array: salva un array su file e lo ricarica verificando che sia identico.

import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class es9 {
    public static void saveBackup(String file, int[] a) {
        try (FileWriter output = new FileWriter(new File(file), false)) {
            for (int i : a) output.append(i + " ");
        } catch (IOException e) {
            System.out.print("\nErrore nel salvataggio del backup: " + e.getMessage());
        } catch (Exception e) {
            System.out.print("\nErroe: " + e.getMessage());
        }
    }

    public static int[] loadBackup(String file) {
        int[] res;
        int len = 0;
        int i = 0;
        try (Scanner input = new Scanner(new File(file))) {
            while (input.hasNextInt()) {
                input.nextInt();
                len++;
            }
        } catch (IOException e) {
            System.out.print("\nErrore: " + e.getMessage());
        } catch (Exception e) {
            System.out.print("\nErrore: " + e.getMessage());
        }

        try (Scanner input = new Scanner(new File(file))) {
            res = new int[len];
            while (input.hasNextInt()) res[i++] = input.nextInt();
            return res;
        } catch (IOException e) {
            System.out.print("\nErrore: " + e.getMessage());
        } catch (Exception e) {
            System.out.print("\nErrore: " + e.getMessage());
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[25];
        int[] backup;
        boolean isBackupOkay = true;

        for (int i = 0; i < numbers.length; i++) numbers[i] = rand.nextInt(100);

        saveBackup("output.txt", numbers);
        backup = loadBackup("output.txt");

        if (backup.length == numbers.length) {
            if (backup[0] == -1) isBackupOkay = false;
            for (int i = 0; i < numbers.length || !isBackupOkay; i++) {
                System.out.printf("\nOriginale: %4d - Backup %4d", numbers[i], backup[i]);
                if (backup[i] != numbers[i]) {
                    isBackupOkay = false;
                    break;
                }
            }
            System.out.print(isBackupOkay ? "\nBackup caricato con successo" : "Backup errato");
        } else System.out.print("\nBackup non salvato correttamente");
    }
}