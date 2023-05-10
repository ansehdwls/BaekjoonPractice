import java.util.LinkedList;
import java.util.Scanner;

public class DFSandBFS {
    
    static boolean visit[];
    static int graph[][]; 

    static LinkedList<Integer> q = new LinkedList<>();
    public static void main(String ars[]){
        Scanner sc = new Scanner( System.in );
        
        int n = sc.nextInt();

        int m = sc.nextInt();

        int start = sc.nextInt();

        visit = new boolean [n];
        graph = new int[n][n]; 

        for(int i = 0 ; i < m ; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            graph[r-1][c-1] = 1;
            graph[c-1][r-1] = 1;
        }
        for(int i = 0 ; i < n ; i++) visit[i] = false;

        dfs(start-1, n);

        System.out.println();
        for(int i = 0 ; i < n ; i++) visit[i] = false;
        q.add(start-1);
        while(!q.isEmpty()){
            bfs(n);
        }
    }

    public static void dfs(int s, int n){
        visit[s] = true;
        System.out.print(s+1 + " ");

        for(int i = 0 ; i < n ; i++){

            if(graph[s][i] == 1){
                if(!visit[i]) dfs(i,n);
            }
        }
    }
    public static void bfs(int n){
        int s = q.pop();
        if(visit[s]);
        else{
            System.out.print(s+1 + " ");
            visit[s] = true;
            for(int i = 0 ; i < n ; i++){
                if(graph[s][i] == 1) q.add(i);
            }
        }

    }
}
