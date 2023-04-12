import java.util.Scanner;

public class Palindrome {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean isNotPalindrome = false;
        for(int i = 0 ; i < s.length()/2 ; i++){
            if( s.charAt(i) != s.charAt(s.length()-1-i) ){
                isNotPalindrome = true;
                break;
            }
        }

        if(isNotPalindrome)System.out.println(0);
        else System.out.println(1);

    }
}
