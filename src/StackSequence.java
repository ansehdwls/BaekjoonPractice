import java.util.*;
import java.io.*;

public class StackSequence {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String ars[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int A[] = new int[n + 1];
        Stack<Integer> B = new Stack<Integer>();
        LinkedList<String> C = new LinkedList<String>();
        for (int i = 1; i < n + 1; i++)
            A[i] = Integer.parseInt(br.readLine());
        int temp = A[1];

        for (int i = 1; i < n + 1; i++) {
            int a = A[i];
            if (i == 1) {
                for (int j = 1; j < a + 1; j++) {
                    B.push(j);
                    C.add("+");
                }
            }
            if (temp < a) {
                for (int j = 1 + temp; j < a + 1; j++) {
                    B.push(j);
                    C.add("+");
                }
                temp = a;
            }
            if (B.pop() == a) {
                C.add("-");
            } else {
                temp = -1;
                bw.write("NO");
                break;
            }
        }
        if (temp != -1) {
            while (C.size() != 0) {
                bw.write(C.poll() + "\n");
            }
        }
        bw.close();
    }
}
