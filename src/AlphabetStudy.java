import java.util.Scanner;

public class AlphabetStudy {
    
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            String a = sc.next();
            int ans = 0;
            char inst = 'a';
            for(int j = 0 ; j < a.length() ; j++){
                if(a.charAt(j) == inst) ans++;
                else break;
                inst += 1;
            }
            System.out.println(ans);
        }
    }
}
