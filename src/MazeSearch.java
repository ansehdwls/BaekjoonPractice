import java.util.LinkedList;
import java.util.Scanner;

public class MazeSearch {
    
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int maze[][] = new int [N][M];
        int visit[][] = new int [N][M];
        for(int i = 0 ; i < N; i++){
            String a = sc.next();
            for(int j = 0 ; j < M ; j++) 
                maze[i][j] = a.charAt(j) - '0';
        }

        LinkedList<Integer> q = new LinkedList<>();

        q.add(0);
        q.add(0);
        int n = 0;

        boolean isFinish = false;
        while(!q.isEmpty() && !isFinish){
            int size = q.size()/2;
            for(int i = 0 ; i < size ; i++){
                int x = q.pop();
                int y = q.pop();
                if(x == N-1 && y == M-1) {
                    isFinish = true;
                    break;
                }

                if(visit[x][y] == 0){
                    visit[x][y] = 1;

                    if(x+1 < N){
                        if(maze[x+1][y] == 1){
                            q.add(x+1);
                            q.add(y);
                        }
                    }
                    if(y+1 < M){
                        if(maze[x][y+1] == 1){
                            q.add(x);
                            q.add(y+1);
                        }
                    }
                    if(x-1 >= 0){
                        if(maze[x-1][y] == 1){
                            q.add(x-1);
                            q.add(y);
                        }
                    }
                    if(y-1 >= 0){
                        if(maze[x][y-1] == 1){
                            q.add(x);
                            q.add(y-1);
                        }
                    }

                }

            }
            n++;
        }

        System.out.println(n);
    }
}
