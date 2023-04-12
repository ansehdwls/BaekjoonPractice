import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WaterTax {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String ars[]) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i = 1; i < n+1;i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int tax = 0;
            if(w-r < 0) tax = ( p * w < q ) ?  p * w : q ;
            else tax = ( p * w < q + (w-r)*s ) ?  p * w : q + (w-r)*s;
            System.out.println("#"+i +" "+ tax);
        }
        
    }
}
