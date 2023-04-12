import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DoIf {
    
    public static void main( String ars[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] name = new String[N];
        Long[] power = new Long[N];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            power[i] = Long.parseLong(st.nextToken());
        }
        int b = 0;
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            Long a = Long.parseLong(st.nextToken());
            for(int j = b ; j < N ; j++){
                if(a <= power[j]){
                    bw.write(name[j] +"\n");
                    break;
                }
                else b++;
            }
        }
        bw.flush();
        bw.close();

    }
}
