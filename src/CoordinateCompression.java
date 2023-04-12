import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class CoordinateCompression {
    
    public static void main(String ars[]) throws IOException{

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int A[] = new int [N];
        int B[] = new int [N];

        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
            B[i] = A[i];
        }
        Arrays.sort(B);

        Map<Integer,Integer> map  = new HashMap<Integer,Integer>(); 
        int idx = 1;
        map.put(B[0] ,0);
        
        for(int i = 1 ; i < N ; i++){
            if(B[i] == B[i-1]);
            else map.put(B[i] ,idx++);
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0 ; i < N ; i++){
            bw.write(map.get(A[i]) + " ");
        }
        bw.flush(); 
        bw.close(); 
    }
}