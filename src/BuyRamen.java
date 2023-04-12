import java.util.LinkedList;
import java.util.Scanner;

public class BuyRamen {

    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ramen[] = new int[N+1];
        LinkedList<Integer> q = new LinkedList<>();
        boolean connect = false;
        int count = 0;
        int i = 0;
        int j = 0;
        for(i = 1 ; i < N+1 ; i++){
            ramen[i] = sc.nextInt();
            if(ramen[i] > 0) connect = true;
            else connect = false;
            if(connect) {
                count += ramen[i];
                q.add(i);
            }
        }
        int price = 0;
        while(count != 0){
            connect = false;
            while(q.size() != 0){
                j = q.poll();
                if(ramen[j] > 0) price += 1;
                for(i = j ; i < N+1 ; i++)
                {
                    if(ramen[i] > 0) {
                        ramen[i]--;
                        price += 2;
                        count--;
                    }
                    else break;
                }
            }
            for(i = 1 ; i < N+1 ; i++){
                if(ramen[i] > 0) connect = true;
                else connect = false;
                if(connect) q.add(i);

            }
        }
        System.out.println(price);

    }
}
