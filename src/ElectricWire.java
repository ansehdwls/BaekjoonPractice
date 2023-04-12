import java.util.Scanner;

public class ElectricWire {

    public static void main(String ars[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int WireA[] = new int[501];
        int WireB[] = new int[501];
        int point = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            WireA[A] = B;
            WireB[B] = A;
        }

        int Wire[] = new int[N];
        for(int i = 0 ; i < 501 ; i++){
            if( WireA[i] != 0) 
            {
                Wire[point] = WireA[i];
                point++;
            }
        }
        int cacheA[] = new int[N];

        cacheA[0] = 1;
        for (int i = 1; i < N; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (Wire[i] > Wire[j]) {
                    cacheA[i] = Math.max(cacheA[j] + 1, cacheA[i]);
                }
            }
            if (cacheA[i] == 0)
                cacheA[i] = 1;
        }
        int maxA = cacheA[0];
        for (int i = 1; i < N; i++) {
            if (maxA < cacheA[i])
                maxA = cacheA[i];
        }


        System.out.println(N - maxA);

    }
}
