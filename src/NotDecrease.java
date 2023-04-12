import java.util.*;
import java.io.*;
public class NotDecrease {
    
    static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
    static long cache[][] = new long[10][65];
    public static void main(String ars[]) throws IOException{
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < 10; i++){
            for(int j = 0 ; j < 65 ; j++) cache[i][j] = -1;
        }
        for(int i = 0 ; i < 10; i++) cache[i][0] = 10-i;
        for(int i = 2 ; i < 65; i++){
            for(int j = 0 ; j < 10 ; j++)
            {
                cache[j][i] = Decrease(j, i);
            }
        }
        for(int i = 0 ; i < T ; i++){
            int n = Integer.parseInt(br.readLine());
            long sum = 0;
            for(int j = 0 ; j < 10 ; j++)
            {
                sum += cache[j][n];
            }
            if(n == 1) bw.write(10);
            else System.out.println( sum * -1);
        }
        bw.flush();
        bw.close();

    }
    public static long Decrease(int a, int n){
        long sum = 0;
        for(int i = 9 ; i > a-1 ; i--){
            sum += cache[i][n-1];
        }
        return sum;

    }
}
