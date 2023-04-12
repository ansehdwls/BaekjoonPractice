import java.util.Scanner;

public class consRosPuzzle {
    
    public static void main(String ars[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1 ; test_case < T+1 ; test_case++){
			int N = sc.nextInt();
			int wordLen =sc.nextInt();
			int wordPuzzle[][] = new int[N][N]; 
			int res = 0;
			for(int i = 0 ; i < N ; i++) {
				boolean isConnect = false;
				int checkLen = 0;
				for(int j = 0; j < N ; j++) {
					wordPuzzle[i][j] = sc.nextInt();
					if(wordPuzzle[i][j] == 1) isConnect = true;
					else {
						if( checkLen == wordLen) res++;
						checkLen = 0;
						isConnect = false;
					}
					if(isConnect) checkLen++;
				}
				if( checkLen == wordLen) res++;
			}
			
			for(int i = 0 ; i < N ; i++) {
				boolean isConnect = false;
				int checkLen = 0;
				for(int j = 0; j < N ; j++) {
					if(wordPuzzle[j][i] == 1) isConnect = true;
					else {
						if( checkLen == wordLen) res++;
						checkLen = 0;
						isConnect = false;
					}
					if(isConnect) checkLen++;
				}
				if( checkLen == wordLen) res++;
			}
			
			
			System.out.println("#"+test_case +" "+res);
		}
	}
}
