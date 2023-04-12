import java.util.Scanner;

public class NumberOne {
    
    public static void main(String ars[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 1; t< T+1; t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			long M = 0;
			long m = 0;
			for(int i = 1 ; i < A+1 ; i++){
				M += Math.pow(2, A+B-i);
			}
			m = (long) Math.pow(2, A+B-1);
			for(int i = 0 ; i < A-1 ; i++){
				m += Math.pow(2,i);
			}
			System.out.println("#" + t + " "+NumOne(m*M));
		}
	}
	public static int NumOne(long n) {
		
		if(n/2 == 0) return (int) (n%2);
		else if(n/2 == 1) return (int) (n%2 + 1);
		else {
			return (int)n%2 + NumOne(n/2);
		}

		
	}
}
