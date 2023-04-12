import java.util.Arrays;
import java.util.Scanner;

public class treasureBoxPassword {
    public static void main(String ars[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case < T + 1; test_case++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int num = N / 4;
			String password[] = new String[N];
			String n = sc.next();
			int i = 0;
			int j = 0;
			int k = 0;
			while (j != N) {
				if (i + num > N) {
					k++;
					password[j] = n.substring(N - k, N);
					password[j] = password[j].concat(n.substring(0, num - k));
					i = k;
				} else {
					password[j] = n.substring(i, i + num);
					i = i + num;
				}
				j++;
			}
			int passNum[] = new int[N];
			for (i = 0; i < N; i++) {
				passNum[i] = change(password[i], num, num - 1);
			}

			Arrays.sort(passNum);
			int minus = 0;
			for (i = 1; i < N; i++) {

				if (passNum[i] == passNum[i - 1]) {
					passNum[i] = 0;
					minus++;
				}
			}
			Arrays.sort(passNum);
			System.out.println(passNum[N - K]);
		}
	}

	public static int change(String a, int n, int m) {
		int res = changeNum(a.charAt(n - m - 1));
		if (m == 0)
			return res;
		else {
			int k = 1;
			for (int i = 0; i < m; i++) {
				k = k * 16;
			}
			return res * k + change(a, n, m - 1);
		}

	}

	public static int changeNum(char A) {
		if (A == 'A')
			return 10;
		else if (A == 'B')
			return 11;
		else if (A == 'C')
			return 12;
		else if (A == 'D')
			return 13;
		else if (A == 'E')
			return 14;
		else if (A == 'F')
			return 15;
		else
			return (int) A - 48;

	}
    
}
