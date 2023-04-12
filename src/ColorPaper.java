import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColorPaper {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String ars[])throws IOException{

        int paper[][] = new int[101][101];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int size = 0;
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j = a ; j < a+10; j++)
                for(int k = b; k < b+10; k++){
                    if(paper[j][k] == 0){
                        paper[j][k] = 1;
                        size++;
                    }  
                }
        }
        System.out.println(size);

    }
}
