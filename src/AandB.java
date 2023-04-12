import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class AandB {
    
    static int res = -1;
    public static void main(String ars[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String r = br.readLine();
        LinkedList<String> a = new LinkedList<>();
        while(res == -1){
            if(s.length() < r.length()){
                if(r.charAt(r.length()-1) == 'A') a.add(A(r));
                else a.add(B(r));
                r = a.poll();
            }
            else{
                if( s.equals(r)) res = 1;
                else{
                    res = 0;
                }
            }
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
    // Option
    public static String A(String s){
        return s.substring(0, s.length()-1);
    }
    public static String B(String s){
        StringBuffer sb = new StringBuffer(s.substring(0, s.length()-1));
        return sb.reverse().toString();
    }
}
