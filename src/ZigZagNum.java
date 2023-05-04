import java.util.Scanner;

public class ZigZagNum {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i = 0 ; i < N ; i ++){
            int n = sc.nextInt();
            int sum = 0;
            for(int j = 1 ; j < n+1 ; j++){
                if(j%2 == 1) sum += j;
                else sum-= j;
            }
            System.out.println(sum);
        }
    }
}
