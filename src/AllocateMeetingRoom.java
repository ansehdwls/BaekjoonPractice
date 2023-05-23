import java.util.Scanner;

public class AllocateMeetingRoom {
    static int N;
    static int visit[];
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        int start[] = new int [N];
        int finish[] = new int [N];

        visit = new int [N];
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            start[i] = sc.nextInt();
            finish[i] = sc.nextInt();
            if( max < finish[i]) max = finish[i];
        }

        while(!isAllVisit()){
            int s = 0;
            int f = 0;
            int n = 1;

            for(int i = 0 ; i < N ; i++){
                if(visit[i] == 0){
                    s = start[i];
                    f = finish[i];

                    break;
                }
            }

            for(int i = f; i < max;i++){

            }

        }

    }

    public static boolean isAllVisit(){
        for(int i = 0 ; i < N ; i++){
            if(visit[i] == 0) return false;
        }
        return true;
    }
}
