import java.util.Scanner;

public class StairsNum {
    
    static long cache[][];
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cache = new long [n+1][10];

        // 한자리 일때 1의 자리 수 9개
        for(int i = 1; i < 10 ; i++){
            cache[1][i] = 1;
        }

        for(int i = 2 ; i < n+1 ; i++){
            for(int j = 0; j < 10 ; j++){

                if(j == 0) cache[i][j] = cache[i-1][j+1];
                else if( j == 9) cache[i][j] = cache[i-1][j-1];
                else cache[i][j] = (cache[i-1][j-1] +cache[i-1][j+1]);

                cache[i][j] %= 1000000000;
            }
        }
        long result = 0;
        for(int i = 0; i < 10 ; i++){
            result += cache[n][i];
        }
        
        System.out.println(result%1000000000);
    }

}
