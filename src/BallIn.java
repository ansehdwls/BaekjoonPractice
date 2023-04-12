import java.util.Scanner;

public class BallIn {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int N, M, i, j, k; // 변수 정의

        N = sc.nextInt(); // N 개의 바구니, 및 공의 번호.
        M = sc.nextInt(); // M 번 바구니에 넣자.

        int basket[] = new int[N+1]; // 1~N개의 바구니를 0번 바구니는 제외.

        for(int a = 0 ; a < M ; a++) // M번 넣기.
        {
            i = sc.nextInt(); 
            j = sc.nextInt();
            k = sc.nextInt();

            for(int b = i ; b <= j ; b++) // i~j번의 바구니에 K공을 넣음.
            {
                basket[b] = k;
            }

        }

        for(int a = 1 ; a < N+1 ; a++) {
            if( a == 1) System.out.print(basket[a]);
            else System.out.print(" " + basket[a]);
         } // 바구니 출력
        
        
    }
}
