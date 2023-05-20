import java.util.Scanner;

public class Zoo {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int denominator = 9901;
		
		int DP[][] = new int [N][3];
		
		for(int i = 0 ; i < N ; i++) {
			DP[i][0] = 1;
			DP[i][1] = 1;
			DP[i][2] = 1;
		}
		int n = 1;
		while(n != N) {
			DP[n][0] = ( DP[n-1][0] + DP[n-1][1] + DP[n-1][2] ) % denominator;
			DP[n][1] = (DP[n-1][0] + DP[n-1][2])  % denominator;
			DP[n][2] = (DP[n-1][0] + DP[n-1][1]) % denominator;
			n += 1;
		}

        System.out.println(( DP[N-1][0] + DP[N-1][1] + DP[N-1][2] ) % denominator);

    }
}
