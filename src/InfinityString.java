import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InfinityString {

    static Scanner sc = new Scanner(System.in);
    public static void main(String ars[]) throws IOException {

        int T = sc.nextInt();
        for (int i = 1; i < T + 1; i++) {
            String s = sc.next();
            String t = sc.next();
            if (s.length() == t.length()) {
                if (s.equals(t))
                    System.out.println("#" + i + " yes");
                else
                    System.out.println("#" + i + " no");
            } else {
                    int lenS = s.length();
                    int lenT = t.length();
                    String tempS = s;
                    String tempT = t;
                    while(lenS != lenT){

                        if(lenS < lenT){
                            s += tempS;
                            lenS = s.length();
                        }
                        else{
                            t += tempT;
                            lenT = t.length();
                        }
                        System.out.println(tempS);
                    };
                    if (s.equals(t))
                        System.out.println("#" + i + " yes");
                    else
                        System.out.println("#" + i + " no");
            } 
        }
    }
}
