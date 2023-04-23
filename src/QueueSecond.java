import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Scanner;

public class QueueSecond {
    
    public static void main(String ars[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        LinkedList<Integer> q = new LinkedList<Integer>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++){

            StringTokenizer a = new StringTokenizer(br.readLine(), " ");
            String b = a.nextToken();
            if(b.equals("push")){
                q.push(Integer.parseInt(a.nextToken()));
            }
            else if(b.equals("pop")){
                if(!q.isEmpty()){
                    bw.write(q.pollLast() + "\n");
                }
                else bw.write(-1+ "\n");
            }
            else if(b.equals("size")){
                bw.write(q.size()+ "\n");
            }
            else if(b.equals("empty")){
                if(!q.isEmpty()){
                    bw.write(0+ "\n");
                }
                else bw.write(1+ "\n");
            }
            else if(b.equals("front")){
                if(!q.isEmpty()){
                    bw.write(q.peekLast()+ "\n");
                }
                else bw.write(-1+ "\n");
            }
            else // a == back
            {
                if(!q.isEmpty()){
                    bw.write(q.peek()+ "\n");
                }
                else bw.write(-1+ "\n");
            }
        }
        bw.flush();
	    bw.close();
    }
}
