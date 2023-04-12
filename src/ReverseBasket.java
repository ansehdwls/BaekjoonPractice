import java.util.Scanner;

public class ReverseBasket {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int basket[] = new int [N];
        int basketR[] = new int [N];
        for(int i = 0 ; i < N ; i++) {
            basket[i] = i+1;
            basketR[i] = basket[i];
        }

        for(int i = 0 ; i < M ; i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            int q = 0;
            for(int a = m-1; a < k; a++){
                basketR[j-1+q++] = basket[a];
            }
            for(int a = j-1; a < m-1; a++){
                basketR[j-1+q++] = basket[a];
            }



            for(int u = 0 ; u < N ; u++) {
                basket[u] = basketR[u];
            }
        }

        for(int i = 0 ; i < N ; i++) {
            System.out.println(basket[i]);
        }
    }
}
