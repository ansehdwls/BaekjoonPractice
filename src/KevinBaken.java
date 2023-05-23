import java.util.LinkedList;
import java.util.Scanner;

public class KevinBaken {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int V = sc.nextInt();

        int ver[][] = new int [N][N];
        for(int i = 0 ; i < V ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ver[a-1][b-1] = 1;
            ver[b-1][a-1] = 1;
        }
        int min = 2000000000;
        int min1 = 2000000000;

        int ans = 1;

        for(int i = 0 ; i < N ; i++){
            int n = 0;
            LinkedList<Integer> q = new LinkedList<>();
            int visit[] = new int [N];

            if(min > min1){
                ans = i;
                min = min1;
            }

            min1 = 0;
            q.add(i);

            while(!q.isEmpty()){

                int size = q.size();

                for(int j = 0 ; j < size ; j++){
                    int a = q.pop();
                    if(visit[a] != 1){
                    min1 += n;
                    visit[a] = 1;
                    for(int k = 0 ; k < N; k++){
                        if(ver[a][k] == 1){
                            if(visit[k] == 0) q.add(k);
                        }
                    }
                    }
                }
                n++;
            }

        }

        System.out.println(ans);
        
    }
}
