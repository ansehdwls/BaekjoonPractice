import java.util.Arrays;
import java.util.Scanner;

public class NormalBag {
    
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int bag[] = new int [N];
        int weight[] = new int [N];
        for(int i = 0 ; i < N ; i++) {
            bag[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        for(int i = 0 ; i < N ; i++) {
            int a = 0;
            if(bag[i] < bag[i-1]){
                a = bag[i-1];
                bag[i-1] = bag[i];
                bag[i] = a;

                a = weight[i-1];
                weight[i-1] = weight[i];
                weight[i] = a;

                i = 0;
            }
        }
        
        for(int i = 0 ; i < N ; i++){

        }
    }
}
