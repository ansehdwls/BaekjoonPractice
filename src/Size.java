import java.util.Arrays;
import java.util.Scanner;

public class Size {
    static int rank[];
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size[] = new int[n];
        int size1[] = new int[n];
        rank = new int[n];
        for( int i = 0 ; i < n ; i++){
            size[i] = sc.nextInt();
            size1[i] = sc.nextInt();
            rank[i] = 1;
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
        
                if( size[i] <= size[j] && size1[i] <= size1[j]) {
                    if(size[i] == size[j] && size1[i] == size1[j] );
                    else rank[i]++;
                }
            }
        }

        for( int j = 0 ; j < n ; j++){
            System.out.print(rank[j] + " ");
        }

    }
}
