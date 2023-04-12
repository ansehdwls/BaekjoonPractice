import java.util.Scanner;

public class TripleAddition {
    
    public static void main(String ars[]) throws Exception{

        Scanner sc = new Scanner(System.in);
        long res = 0;
        for(int i = 0 ; i < 3; i++) res += sc.nextLong();

        System.out.println(res);
    }
}