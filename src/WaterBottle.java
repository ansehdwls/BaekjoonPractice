
import java.util.Scanner;


public class WaterBottle {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int res = 0;
        if(N <= K);
        else{
            while(true){
                int n = N;
                int min = 1;
                while(true){
                    if(n%2 != 0){
                        min++;
                    }
                    if(n/2 == 1) break;
                    n = n/2;
                }
            
                if( min  <= K) break;

                N++;
                res++;
            }
        }
        System.out.println(res);

    }
}
