import java.util.Scanner;

public class BallChange {
    static int basket[];
    public static void main(String arsp[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        basket = new int[N];

        for(int i = 1 ; i < N+1 ; i++){
            basket[i-1] = i;
        }

        for(int i = 0 ; i < M ; i++){
            
            Change(sc.nextInt()-1, sc.nextInt()-1);
        }
        for(int i = 0 ; i < N ; i++){
            System.out.println(basket[i]);
        }
    }

    public static void Change(int i , int j){
        int a = basket[i];
        basket[i] = basket[j];
        basket[j] = a;
    }
}
