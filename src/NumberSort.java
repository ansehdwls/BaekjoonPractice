import java.util.Arrays;
import java.util.Scanner;

public class NumberSort {
    
    public static void main(String ars[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t < T + 1; t++) {
            int N = sc.nextInt();
            int A[] = new int[N];

            for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            System.out.print("#"+t);
            for(int i = 0 ; i < N ; i++){
                System.out.print( " "+A[i]);
            }
            System.out.println();
        
        }
    }
}
