import java.util.LinkedList;
import java.util.Scanner;

public class HideAndSeek {
    static int N;
    static int K;
    static int visit[];
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        visit = new int [100001];

        N = sc.nextInt();
        K = sc.nextInt();
        int n = 0;
        LinkedList<Integer> q = new LinkedList<>();
        
        q.add(N);
        boolean isFind = false;
        while(!q.isEmpty()){
            if(isFind) break;
            int size =q.size();
            for(int i = 0 ; i < size ; i++){
                int a = q.pop();
                
                visit[a] = 1;
                if(a == K) {
                    System.out.println(n);
                    isFind = true;
                    break;
                }

                if( a+1 < 100001) if(visit[a+1] == 0) q.add(a+1);

                if( a-1 >= 0) if(visit[a-1] == 0) q.add(a-1);
                    
                if(2*a < 100001) if(visit[2*a] == 0) q.add(2*a);
                

            }
            n++;
        }

    }

}
