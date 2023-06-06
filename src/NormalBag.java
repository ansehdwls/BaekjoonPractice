import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class bag {
    int weight;
    int value;

    public bag(int weight, int value){
        this.weight = weight;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    public int getWeight(){
        return this.weight;
    }
}

public class NormalBag {
    static bag Goods[];
    static int DP[][];
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Goods = new bag[N+1];
        for(int i = 1 ; i < N+1 ; i++) {
            Goods[i] = new bag(sc.nextInt() ,sc.nextInt());
        }

        DP = new int [N+1][K+1];

        System.out.println(max(N,K));
    }

    public static int max(int N, int K){
        for(int i = 1 ; i < N+1 ; i++){
            for(int j = 1 ; j < K+1 ; j++){
                if(j >= Goods[i].getWeight()){
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i - 1][j - Goods[i].getWeight()] + Goods[i].getValue());
                }
                else{
                    DP[i][j] = DP[i-1][j];
                }
            }
        }

        return DP[N][K];
    }
    
}

