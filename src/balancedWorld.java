import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class balancedWorld {
    
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        while(a.charAt(0) != '.'){
            Stack<Character> q = new Stack<>();
            boolean isBalanced = true;
            for(int i = 0 ; i < a.length() ; i++){
                if( a.charAt(i) == '[' || a.charAt(i) == '(') q.add(a.charAt(i));
                if( a.charAt(i) == ']'){
                    if( q.size() == 0){
                        isBalanced = false;
                        break;
                    }
                    if( q.pop() != '['){
                        isBalanced = false;
                        break;
                    }
                }
                if( a.charAt(i) == ')') {
                    if( q.size() == 0){
                        isBalanced = false;
                        break;
                    }
                    if( q.pop() != '('){
                        isBalanced = false;
                        break;
                    }
                }
            }
            if(isBalanced && q.size() == 0) System.out.println("yes");
            else System.out.println("no");
            a = sc.nextLine();
        }
    }
}
