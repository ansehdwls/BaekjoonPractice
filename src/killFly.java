import java.util.Scanner;

public class killFly {
    
    public static void main(String ars[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1 ; test_case < T+1 ; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int fly[][] = new int[N][N];
			for(int i = 0 ; i < N ;i++) {
				for(int j = 0 ; j < N ; j++)
				fly[i][j] = sc.nextInt();
			}
			
			int death[][] = new int[N-M+1][N-M+1];
			int max = 0;
			for(int x = 0 ; x < N-M+1 ;x++) {
				for(int y = 0 ; y < N-M+1 ;y++) {
					
					for(int i = x ; i< M+x; i++) {
						for(int j = y; j < M+y ; j++) {
							death[x][y] += fly[i][j];
						}
					}
					if(max < death[x][y]) max = death[x][y];
				}
			}
			System.out.println("#"+test_case + " " + max);
		}
	}
}
