import java.util.Scanner;

public class NumberRotation {
    static String Num[][];
    static String RNum[][];
    static String CNum[][];

    public static void main(String ars[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t < T + 1; t++) {
            int N = sc.nextInt();
            Num = new String[N][N];
            CNum = new String[N][N];
            RNum = new String[N][N];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++) {
                    RNum[i][j] = "";
                    Num[i][j] = sc.next();
                    CNum[i][j] = Num[i][j];
                }

            for (int i = 0; i < 3; i++) {
                Rotate(i, N);
            }
            System.out.println("#"+t);
            for (int i = 0; i < N; i++) {
                System.out.print(RNum[i][0]);
                for (int j = 1; j < N; j++) {
                    System.out.print(" " + RNum[i][j]);
                }
                System.out.println("");
            }
        }
    }

    public static void Rotate(int n, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Num[i][j] = CNum[N - j - 1][i];
                RNum[i][n] += Num[i][j];
            }
        }
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                CNum[i][j] = Num[i][j];
            }
    }
}
