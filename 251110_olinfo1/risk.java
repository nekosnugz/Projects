// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class risk {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Locale.setDefault(Locale.US);
        InputStream fin = System.in;
        OutputStream fout = System.out;
        // uncomment the two following lines if you want to read/write from files
        // fin = new FileInputStream("input.txt");
        // fout = new FileOutputStream("output.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fout));
        reader = new BufferedReader(new InputStreamReader(fin));
        scn = new StringTokenizer(reader.readLine());

        int T = Integer.parseInt(next());
        for (int test = 1; test <= T; ++test) {
            int N = Integer.parseInt(next());
            int M = Integer.parseInt(next());

            String W = "";


            // INSERT YOUR CODE HERE
            int a, b;

            if (N == M) W = "draw";
            else {
                if (N > M) {
                    a = N;
                    b = M;
                } else {
                    a = M;
                    b = N;
                }

                W = ((a - b % 2 - 1 >= b / 2) || (a / 2 + a % 2 >= b / 3)) ? "filippo" : "tommaso";
            }




            writer.write(W);
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
