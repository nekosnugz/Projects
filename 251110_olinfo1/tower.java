// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class tower {

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

        int N = Integer.parseInt(next());
        int S = Integer.parseInt(next());

        int[] H = new int[N];
        for (int i = 0; i < N; ++i)
            H[i] = Integer.parseInt(next());

        String[] ans = new String[N];


        // INSERT YOUR CODE HERE

        for (int i = 0; i < H.length; i++) {
            if (H[i] > S) ans[i] = "NO";
            else if (H[i] == S) {
                ans[i] = "YES";
                for (int j = 0; j < H.length; j++) if (i != j) ans[j] = "NO";
                break;
            } else {    // H[i] < S
                int num;
                int pos=0;
                boolean isEssenz=true;
                for (int j2 = 0; j2 < H.length-1; j2++){
                    if (j2 == i) continue;
                    pos=j2;
                    num=0;
                    for (int j = 0; j < H.length - 2; j++) {

                        System.out.println("essenz: "+isEssenz + "  num: "+num +"  pos: "+pos + "  j: "+j + "  j2: "+j2 + "  i: "+i);
                        if (pos >= H.length) pos -= H.length;

                        num += H[pos++]; System.out.println("\""+num+"\" ");
                        
                        if (num > S) {
                            if (pos == 0 && i != H.length-1) num -= H[H.length-1];
                            else if(pos == 0 && i == H.length-1) num -= H[H.length-2];
                            else num -= H[pos - 1];
                            System.out.println("\"num: "+num+"_pos:"+pos+" \" ");
                        } 

                        if (num == S) {
                            isEssenz = false;
                            System.out.println("essenz: "+isEssenz + "  num: "+num +"  pos: "+pos + "  j: "+j + "  j2: "+j2 + "  i: "+i);
                            break;
                        }
                    }
                    if (!isEssenz) break;
                }
                System.out.println("_________________________________");
                if (isEssenz) ans[i] = "YES";
                else ans[i]="NO";
            }
        }

        


        for (int i = 0; i < N; ++i) {
            writer.write(ans[i]);
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
