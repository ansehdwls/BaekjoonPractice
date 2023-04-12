import java.util.Scanner;

public class WineVerify {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int wine[] = new int [N+1];
        int cache[] = new int[N+1];
        for(int i = 1 ; i < N+1 ; i++) wine[i] = sc.nextInt();
        cache[0] = 0;
        cache[1] = wine[1];
        cache[2] = wine[1] + wine[2];

        for(int i = 3 ; i < N+1 ; i++){
            cache[i] = Math.max(cache[i-3]+ wine[i-1] +wine[i] , cache[i-2] + wine[i]);
            cache[i] = Math.max(cache[i] , cache[i-1]);
        }

        System.out.println(cache[N]);
    }
}
