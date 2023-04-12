import java.util.Scanner;

public class NoHomework {
    
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);

        int a[] = new int[31];
        a[0] = 1;
        for(int i = 0 ; i < 28 ; i++) a[sc.nextInt()]++;
        for(int i = 1 ; i < 31 ; i++) {
            if(a[i] == 0) System.out.println(i);
        }
    }
}

