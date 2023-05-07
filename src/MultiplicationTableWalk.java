import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MultiplicationTableWalk {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0 ; j < t ; j++){
            long N = sc.nextLong();
            ArrayList<Long> factor = new ArrayList<>();
            int n = 0; // 약수의 개수
            for(long i = 1; i <= Math.sqrt(N); i++){
                if(N % i == 0){
                    factor.add(i);
                    n++;
                    if(N / i != i){
                        factor.add(N / i);
                        n++;
                    }
                }
            }
            factor.sort(Comparator.naturalOrder()); // 오름차순
            if( n % 2 == 1) {
                System.out.println(factor.get(n/2)*2-2);
            }
            else{
                System.out.println(factor.get(n/2-1) + factor.get(n/2) -2);
            }
        }
    }
}
