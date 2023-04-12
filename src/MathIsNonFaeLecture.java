import java.util.Scanner;

public class MathIsNonFaeLecture {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        System.out.println( (e*c - b*f) / ( a*e-b*d )+" " +(c*d-a*f ) / (b*d - a*e));

    }
}
