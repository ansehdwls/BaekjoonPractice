import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RichProject {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String arsp[]) throws IOException {

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i < t+1; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] A = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            long res = 0;
            for (int j = 0; j < n; j++) {
                A[j] = Integer.parseInt(st.nextToken());
            }
            int max = A[n-1];
            for (int j = n-1; j > -1; j--) {
                if(max < A[j]){
                    max = A[j];
                }
                else{
                    res += max - A[j];
                }
            }
            System.out.println(res);
        }

    }
}