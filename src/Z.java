import java.util.Scanner;

public class Z {
    static int r = 0;
    static int c = 0;
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();


        int finish = 1;
        for(int i = 0 ; i < N; i++) finish *= 4;

        System.out.println(find(0, finish-1, c, r, N));

    }


    public static int find(int start, int finish, int r, int c, int n){
        int length = 1;
        int base = 1;
        for(int i = 0 ; i < n; i++) length *= 2;
        for(int i = 0 ; i < n-1; i++) base *= 4;

        if(r < length/2 && c < length/2){
            if(length/2 -1 == r && c == length/2 -1) return finish - 3*base;
            return find(start, finish - 3*base,r ,c, n-1);
        }
        else if(r >= length/2 && c < length/2){
            if(length - 1 == r && c == length/2 -1) return finish - 2*base;
            r -= length/2; 
            return find(start+base, finish - 2*base,r ,c, n-1);
        }
        else if(r < length/2 && c >= length/2){
            if(length/2 -1 == r && c == length -1) return finish - base;
            c -= length/2;
            return find(start+ 2*base, finish - base,r ,c, n-1);
        }
        else{
            if(length -1 == r && c == length -1) return finish;
            r -= length/2; 
            c -= length/2;
            return find(start+ 3*base, finish,r ,c, n-1);
        }


    }
}
