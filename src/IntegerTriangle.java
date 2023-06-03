import java.util.Scanner;

public class IntegerTriangle {
    static int DP[][];
    static int triangel[][];
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        triangel = new int [N][N];
        DP = new int [N][N];

        for(int i = 0; i < N ; i++){
            for(int j = 0 ; j < i+1 ; j++){
                triangel[i][j] = sc.nextInt();
                DP[i][j] = -1;
            }
        }

        DP[0][0] = triangel[0][0];

        for(int i = 0 ; i < N ; i++){
            sum(N-1,i);
        }
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            if( max < DP[N-1][i]) max = DP[N-1][i];
        }

        for(int i = 0; i < N ; i++){
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print(" " + triangel[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < N ; i++){
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print(" " + DP[N-1][i]);
            }
            System.out.println();
        }
        System.out.println(max);

    }

    public static int sum(int i, int j){
        if(i == 0) return DP[0][0];
        if( DP[i][j] != -1) return DP[i][j];
        else{
            if( j == 0) DP[i][j] = triangel[i][j] + sum(i-1,j);
            else if(j == i) DP[i][j] = triangel[i][j] + sum(i-1,j-1);
            else DP[i][j] = triangel[i][j] + Math.max(sum(i-1,j),sum(i-1,j-1));
        }
        return DP[i][j];
    }
}
