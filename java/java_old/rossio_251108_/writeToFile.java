import java.io.*;

public class writeToFile {
    public static void printNumbersToFile(String fname, int n) {
        try {
            PrintWriter file = new PrintWriter(fname);
            for (int i = 0; i < n; i++) {
                file.printf("%3d ", i+1);
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Errore nella creazione del file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        printNumbersToFile("es1.txt", 20);
    };
}