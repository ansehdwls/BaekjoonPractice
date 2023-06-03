import java.util.LinkedList;
import java.util.Scanner;

public class SafetyArea {
    
    static int area[][];
    static int visit[][];
    static int N;
    static int sum = 0;
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        area = new int[N][N];
        visit = new int[N][N];
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                area[i][j] = sc.nextInt();
                sum += area[i][j];
            }
        }

        int max = 0;
        while(sum > 0){

            LinkedList<Integer> q = new LinkedList<>();
            initVisit();
            int max1 = 0;

            while(!isAllVisit()){
                
                boolean check = false;
                for(int i = 0 ; i < N ; i++){
                    for(int j = 0 ; j < N ; j++){
                        if(area[i][j] != 0 && visit[i][j] == 0){
                            q.add(i);
                            q.add(j);
                            check = true;
                            break;
                        }
                    }
                    if(check) break;
                }

                while(!q.isEmpty()){
                    int i = q.pop();
                    int j = q.pop();
                    if( visit[i][j] != 0) continue;
                    else{
                        
                        visit[i][j] = 1;
                        if( i+1 < N){
                            if(visit[i+1][j] == 0 && area[i+1][j] != 0){
                                q.add(i+1);
                                q.add(j);
                            }
                        }
                        if( j+1 < N){
                            if(visit[i][j+1] == 0 && area[i][j+1] != 0){
                                q.add(i);
                                q.add(j+1);
                            }
                        }
                        if( i-1 >= 0){
                            if(visit[i-1][j] == 0 && area[i-1][j] != 0){
                                q.add(i-1);
                                q.add(j);
                            }
                        }
                        if( j-1 >= 0){
                            if(visit[i][j-1] == 0 && area[i][j-1] != 0){
                                q.add(i);
                                q.add(j-1);
                            }
                        }
                    }
                    
                }

                max1++;
            }

            riseArea();
            max = Math.max(max, max1);

        }

        System.out.println(max);

    }
    public static boolean isAllVisit(){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(visit[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void initVisit(){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(area[i][j] == 0) visit[i][j] = 1;
                else visit[i][j] = 0;
            }
        }
    }

    public static void riseArea(){
        sum = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(area[i][j] != 0) area[i][j] -= 1;
                sum += area[i][j];
            }
        }
    }
}
