import java.util.Scanner;

public class NewRecuits {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i++){

            int N = sc.nextInt();
            int[] recuits = new int [N];
            for(int j = 0 ; j < N ; j++){
                recuits[sc.nextInt()-1] = sc.nextInt()-1;
            }

             int num = 1;
             int min = recuits[0];
             for(int j = 1; j < N ; j++){

                if(min > recuits[j]) {
                    min = recuits[j];
                    num++;
                }
             }

             System.out.println(num);

        }
    }
}
