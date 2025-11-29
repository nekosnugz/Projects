// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class bouncing {

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

        int W = Integer.parseInt(next());
        int H = Integer.parseInt(next());
        long T = Long.parseLong(next());

        int x1 = Integer.parseInt(next());
        int y1 = Integer.parseInt(next());
        int vx = Integer.parseInt(next());
        int vy = Integer.parseInt(next());

        int x2 = Integer.parseInt(next());
        int y2 = Integer.parseInt(next());

        long ans = 0;


        // INSERT YOUR CODE HERE

        //
        writer.write(String.valueOf(ans));
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
