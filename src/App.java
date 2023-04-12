import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for( int i = 1 ; i < n+1 ; i++){
                if(div(i) == 0) System.out.print(i);
                else {
                    for(int j = 0 ; j < div(i);j++)
                    System.out.print("-");
                }

                System.out.print(" ");
            }
        }
    }

    public static int div(int a)
    {
        if(a/10 == 0)
        {
            if(a%3 == 0) return 1;
            else return 0;
        }
        else{
            if((a - a/10 * 10) == 0 ) return 0 + div(a/10);
            else if((a - a/10 * 10)%3 == 0) return 1 + div(a/10);
            else return 0 + div(a/10);
        }
    }
}