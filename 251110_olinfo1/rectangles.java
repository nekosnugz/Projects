// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class rectangles {

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

        int A = Integer.parseInt(next());

        int B = Integer.parseInt(next());

        int C = Integer.parseInt(next());

        int K = 0;


        // INSERT YOUR CODE HERE

        if (A == B && B == C) K = 1;
        else if ((A == B && A != C) || (B == C && A != B) || (A == C && A != B)) K = 3;
        else K = 6;

        writer.write(String.valueOf(K));
        writer.write('\n');

        writer.flush();
    }

    static String next() throws IOException {
        while (!scn.hasMoreTokens()) scn = new StringTokenizer(reader.readLine());
        return scn.nextToken();
    }

    static BufferedReader reader;
    static StringTokenizer scn;
}
