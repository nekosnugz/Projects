import java.io.*;
import java.util.Random;

public class randomToFile {
    public static void randomWrite(String fname, int qty, int bound) {
        try {
            PrintWriter file = new PrintWriter(fname);
            Random r = new Random();

            for (int i = 0; i < qty; i++) file.println(r.nextInt(bound));

            file.close();
        } catch (IOException e) {
            System.out.print("\nErrore nell'apertura del file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        randomWrite("randomOutput", 50, 100);
    }
}
