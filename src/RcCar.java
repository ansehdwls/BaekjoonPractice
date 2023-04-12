import java.util.Scanner;

public class RcCar {
    
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t = 1 ; t < T+1 ; t++){

            int N = sc.nextInt();
            int distance = 0;
            int speed = 0;

            for(int i = 0 ; i < N ; i++){
                int cmd =sc.nextInt();
                if( cmd == 1) speed += sc.nextInt();
                else if(cmd == 2){
                    speed -= sc.nextInt();
                    if( speed < 0) speed = 0;
                }
                else;
                distance += speed;
            }

            System.out.println("#"+t+" "+distance);
        }
    }
}
