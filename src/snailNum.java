import java.util.Scanner;

public class snailNum {
    
    public static void main(String ars[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1 ; test_case < T+1 ; test_case++){
			int n = sc.nextInt();
			int snail[][] = new int[n][n];
			int dir = 0;
			int num = 0;
			int i = 0;
			int j = 0;
			int size = 1;
			while(true)
			{
				if(num == n*n) break;
				num ++;
				if( dir == 0 ) {
					if(j <= n-size) {
						snail[i][j] = num;
						j++;
					}
					else {
						dir = 1;
						j--;
						i++;
						num--;
					}
				}
				else if(dir == 1){
					if(i <= n-size) {
						snail[i][j] = num;
						i++;
					}
					else {
						dir = 2;
						i--;
						j--;
						num--;
					}
				}
				else if( dir == 2) {
					if(j >= 0+size) {
						snail[i][j] = num;
						j--;
					}
					else {
						dir = 3;
						num--;
					}
				}
				else {
					if(i >= 0+size) {
						snail[i][j] = num;
						i--;
					}
					else {
						dir = 0;
						i++;
						j++;
						size++;
						num--;
					}
				}
			}
			System.out.println("#"+test_case);
			for(i = 0 ; i < n;i++ ) {
				System.out.print(snail[i][0]);
				for(j = 1 ; j < n ; j++) {
					System.out.print(" "+snail[i][j]);
				}
				System.out.println();
			}
		}
	}
}
