import java.util.Scanner;

public class Calender {
    
    public static void main(String ars[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1 ; test_case < T+1 ; test_case++){
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			int sum1 = calender(m1-1) + d1;
			int sum2 = calender(m2-1) + d2;
			System.out.print("#"+ test_case + " ");
			System.out.println(sum2 - sum1 + 1);
		}
	}
    public static int calender(int n) {
		while(n != 0)
		switch(n) {
		case 0: 
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
				return 31 + calender(n-1);
			case 4: case 6:case 9: case 11: 
				return 30 + calender(n-1);
			case 2: return 28 + calender(n-1);
		}
		return 0;
	}
}
