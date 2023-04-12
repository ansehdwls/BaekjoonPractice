import java.util.Scanner;

public class Refund {
    
    public static void main(String ars[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1 ; test_case < T+1 ; test_case++){
			int N = sc.nextInt();
			System.out.println("#"+test_case);
			int a = N%50000;
			int b = a%10000;
			int c = b%5000;
			int d = c%1000;
			int e = d%500;
			int f = e%100;
			int g = f%50;
			System.out.print(N/50000 + " " +a/10000 +" " +b/5000 + " " +c/1000 + " " +d/500 + " " +e/100 + " " +  f/50 + " " + g/10);
			
		}
	}
}
