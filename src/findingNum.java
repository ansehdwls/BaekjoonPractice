import java.util.Scanner;

public class findingNum {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0 ; i < N ; i++ ){
            A[i] = sc.nextInt();
        }
        int count = 0;
        int res = sc.nextInt();

        for(int i = 0 ; i < N ; i++ ){
            if(res == A[i]) count++;
        }
        System.out.println(count);
    }
}

