import java.util.Scanner;

public class Multiplication {
    
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println ( pow(a,b,c));

    }

    public static long pow(long a, long b, long c){
        if(b == 1) return a % c;

        long temp = pow(a, b/2, c);

        if(b%2 == 1) return (((temp % c * temp % c ) % c ) * a % c) %c;

        return (temp % c * temp % c ) % c;


    }
}
