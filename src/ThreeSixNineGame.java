import java.util.*;
public class ThreeSixNineGame {
    
    public static int printThree(int a){

        if(a /10 == 0){
            if(a%3 == 0) return 1;
            else return 0;
        }
        else{
            if(a%10 == 0) return printThree(a/10)+0;
            if(a%10%3 == 0) return printThree(a/10)+1;
            else return printThree(a/10)+0;
        }
    }
    public static void printS(int n){
        for(int i = 0 ; i < n; i++){
            System.out.print("-");
        }
    }
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i < n+1;i++){
            if(printThree(i) == 0)System.out.print(i);
            else printS(printThree(i)); 
            System.out.print(" ");
        }
    }
}

