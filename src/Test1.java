import java.util.*;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 1; j < n+1; j++) {
            int in = sc.nextInt();
            int score[] = new int[101];
            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < 1000; i++){
                int m = sc.nextInt();
                score[m]++;
                if( max < score[m]) {
                    max = score[m];
                    maxIndex = m;
                }
                else if(max == score[m]){
                    if(maxIndex < m) maxIndex = m;
                }
            }
            System.out.println("#" + in + " " + maxIndex);

        }

    }

}