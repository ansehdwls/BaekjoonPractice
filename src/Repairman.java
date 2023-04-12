import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Repairman {
    public static void main( String ars[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int A[] = new int[N];
        for(int i = 0 ; i < N ; i++) A[i] = Integer.parseInt(st.nextToken());
        int n = N;
        int count = 0;
        while(n > 0){
            Arrays.sort(A);
            int a = 0;
            int c = A[0];
            for(int i = 0 ; i < n ; i++){
                if(A[i] >= c + L) break;
                else A[i] = 1001;
                a++;
            }
            n -= a;
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
