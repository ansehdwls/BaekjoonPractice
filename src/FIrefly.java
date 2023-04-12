import java.util.*;
import java.io.*;

public class FIrefly {

    static int lane[];
    static int lane1[];

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        lane = new int[H];
        lane1 = new int[H];
        lane[0] = 2000001;
        for (int i = 0; i < H; i++) {
            lane[i] = 0;
            lane1[i] = 0;
        }
        for (int i = 1; i < N + 1; i++) {
            int n = Integer.parseInt(bf.readLine());
            if (i % 2 == 0) {
                    lane[n-1]++;
            } else {
                    lane1[n-1]++;
            }
        }
        for (int i = H-2; i > -1 ; i--) {
            lane[i] += lane[i+1];
            lane1[i] += lane1[i+1];
        }
        for (int i = 0; i < H ; i++) {
            lane[i] += lane1[H-i-1];
        }
        Arrays.sort(lane);
        int sum = 0;
        for (int i = 0; i < H + 1; i++) {
            if (lane[0] != lane[i]) break;
            sum++;
        }
        bw.write(lane[0] + " " + sum);
        bw.flush();
        bw.close();
    }
}
