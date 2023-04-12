import java.util.Scanner;

public class decomposition {
    
    public static void main (String ars[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isTrue = false;
        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            int a = i;
            sum = a;
            while(true){
                sum += a%10;
                if(a/10 == 0) break;
                
                else{
                    a = a/10;
                }
            }
            if(sum == n){ 
                sum = i;
                isTrue = true;
                break;
            }
        }
        if(isTrue) System.out.println(sum);
        else System.out.println(0);
    }
}
