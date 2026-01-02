// NOTA: si raccomanda di usare questo template anche se non lo si capisce completamente.

import java.util.*;
import java.io.*;
// import java.lang.*;

public class caramelle {

    public static int mcm(int a, int b) {
        return Math.abs((a * b) / mcd(a, b));
    }

    public static int mcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Locale.setDefault(Locale.US);
        InputStream fin = System.in;
        OutputStream fout = System.out;
        // decommenta le due righe seguenti se vuoi leggere/scrivere da file
        fin = new FileInputStream("input.txt");
        fout = new FileOutputStream("output.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fout));
        reader = new BufferedReader(new InputStreamReader(fin));
        scn = new StringTokenizer(reader.readLine());

        int T = Integer.parseInt(next());
        for (int test = 1; test <= T; ++test) {
            int N = Integer.parseInt(next());

            int[] V = new int[N];
            for (int i = 0; i < N; ++i)
                V[i] = Integer.parseInt(next());

            int c = 0;

            // INSERISCI IL TUO CODICE QUI
            // Arrays.sort(V);
            
            int temp = V[0];
            for (int i = 0; i < V.length - 1; i++) {
                // System.out.println(V[i]);
                temp = mcm(temp, V[i]);
            }

            c = temp;

            writer.write("Case #");
            writer.write(String.valueOf(test));
            writer.write(": ");
            writer.write(String.valueOf(c));
            writer.write('\n');
        }

        writer.flush();
    }

    static String next() throws IOException {
        while (!scn.hasMoreTokens()) scn = new StringTokenizer(reader.readLine());
        return scn.nextToken();
    }

    static BufferedReader reader;
    static StringTokenizer scn;
}
