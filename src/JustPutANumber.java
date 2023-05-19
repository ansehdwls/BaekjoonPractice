import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class JustPutANumber {
    static int Number[][];
    static int N;
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        Number = new int [N][N];

        LinkedList<Integer> q = new LinkedList<>();
        LinkedList<Integer> r = new LinkedList<>();

        for(int i = 0 ; i < N ; i++){
            String a = sc.next();
            for(int j = 0 ; j < N ; j++){
                Number[i][j] = a.charAt(j) - '0';
            }
        }

        while(!isAllVisit()){

            for(int i = 0 ; i < N ; i++){
                if(!q.isEmpty()) break;
                for(int j = 0 ; j < N ; j++){
                    if(!q.isEmpty()) break;
                    if(Number[i][j] == 1){
                        q.add(i);
                        q.add(j);
                    }
                }
            }
            int size = 0;

            while(!q.isEmpty()){
                int i = q.pop();
                int j = q.pop();

                if(Number[i][j] == 0) continue;
                else{
                Number[i][j] = 0;
                size++;

                if(i+1 < N){
                    if(Number[i+1][j] == 1) {
                        q.add(i+1);
                        q.add(j);
                    }   
                }
                if(j+1 < N){
                    if(Number[i][j+1] == 1) {
                        q.add(i);
                        q.add(j+1);
                    }
                }
                if(i-1 >= 0){
                    if(Number[i-1][j] == 1) {
                        q.add(i-1);
                        q.add(j);
                    }
                }
                if(j-1 >= 0){
                    if(Number[i][j-1] == 1) {
                        q.add(i);
                        q.add(j-1);
                    }
                }
            }
        }
            r.add(size);
            

        }

        r.sort(Comparator.naturalOrder());
        System.out.println(r.size());
        while(!r.isEmpty()){
            System.out.println(r.pop());
        }


    }

    public static boolean isAllVisit(){
        int sum = 0;

        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < N ; j++){
                sum += Number[i][j];
            }
        }
        if(sum == 0) return true;

        return false;
    }
}
