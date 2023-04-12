import java.util.Scanner;

public class ClimbStairs {
    static int Stairs[];
    static int cache[];
    static int N;
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        Stairs = new int[N];
        for( int i = 0 ; i < N ; i++){
            Stairs[i] = sc.nextInt();
        }
        cache = new int [N];
        if(N>3){
        cache[0] = Stairs[0];
        cache[1] = Stairs[0] + Stairs[1];
        cache[2] = Math.max(Stairs[1] + Stairs[2] , Stairs[0] + Stairs[2]);

        for(int i = 3 ; i < N ; i++){
           cache[i] =  Math.max( Stairs[i] + cache[i-2], Stairs[i] + Stairs[i-1] + cache[i-3] );
        }
    }
    else if (N ==2 ){
        cache[0] = Stairs[0];
        cache[1] = Stairs[0] + Stairs[1];
    }
    else cache[0] = Stairs[0];
        System.out.println(cache[N-1]);

    }
}
