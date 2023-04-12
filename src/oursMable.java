import java.util.Arrays;
import java.util.Scanner;

public class oursMable {
    
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int level[] = new int[n];
        int newLevel[] = new int[n];
        int max = 0;
        int idx = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            level[i] = sc.nextInt();
            if(max < level[i]){
                max = level[i];
                idx = i;
            }
        }
        for(int i = 0 ; i < idx; i++) sum += level[i] + max;
        for(int i = idx+1 ; i < n; i++) sum += level[i] + max;
        System.out.println(sum);
    }
}
