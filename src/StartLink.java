import java.util.*;
public class StartLink {
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            int F = sc.nextInt();
            int S = sc.nextInt();
            int G = sc.nextInt();
            int U = sc.nextInt();
            int D = sc.nextInt();
            int visited[] = new int[F+1];
            for(int i = 0 ; i < F+1; i++) visited[i] = -1;
            LinkedList<Integer> q = new LinkedList<Integer>();
            if(S == G){
                System.out.println(0);
            }
            else{
                visited[S] = 0;
                q.add(S);

                int a;
                while(q.size() != 0){
                    a = q.poll();
                    if(a + U <= F){
                        if(visited[a + U] == -1){
                            visited[a+U] = visited[a] + 1;
                            q.add(a+U);
                    }
                    }
                    if(a-D > 0){
                        if(visited[a - D] == -1){
                            visited[a-D] = visited[a]+ 1;
                            q.add(a-D);
                        }
                     }

                }
                if(visited[G] == -1) System.out.println("use the stairs");
                else System.out.println(visited[G]);
            }

        }
    }
}
