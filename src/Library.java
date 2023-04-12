import java.util.*;
import java.io.*;

public class Library {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String ars[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int A[] = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st1.nextToken());
        Arrays.sort(A);
        int sum = 0;
        int n = N;
        int count = 0;
        if (A[0] * -1 < A[n - 1]) {
            sum += A[n - 1];
            for(int i = 0 ; i < M ; i++)
            {
                if(n-1-i < 0 ) break;
                if( A[n-1-i] < 0) break;
                else{
                    A[n-1-i] = 10001;
                    count++;
                }
            }
            n -= count;
        } else {
            sum += A[0] * -1;
            for(int i = 0 ; i < M ; i++)
            {
                if(i > N-1 ) break;
                if( A[i] > 0) break;
                else{
                    A[i] = 10001;
                    count++;
                }
            }
            n -= count;
        }
        Arrays.sort(A);
        while (true) {
            count = 0;
            if( A[0] == 10001) break;
            if (A[0] * -1 < A[n - 1]) {
                sum += A[n - 1]*2;
                for(int i = 0 ; i < M ; i++)
                {
                    if(n-1-i < 0 ) break;
                    if( A[n-1-i] < 0) break;
                    else{
                        A[n-1-i] = 10001;
                        count++;
                    }
                }
                n -= count;
            } else {
                sum += A[0] * -2;
                for(int i = 0 ; i < M ; i++)
                {
                    if(i > N-1 ) break;
                    if( A[i] > 0) break;
                    else{
                        A[i] = 10001;
                        count++;
                    }
                }
                n -= count;
            }
            Arrays.sort(A);
        }
        System.out.println(sum);
    }
}
