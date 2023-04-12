import java.util.LinkedList;

public class targetNum {
    
    public static void main(String ars[]){
        int number[] = {4,1,2,1};
        int target =  4;
        int answer = 0;
        LinkedList<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < number.length ; i++){
            if(q.size() == 0){
                q.add(number[i]);
                q.add(-1 * number[i]);
            }
            else{
                int size = q.size();
                for(int j = 0 ; j < size ; j++){
                    int a = q.pop();
                    q.add(a + number[i]);
                    q.add(a - number[i]);
                }
            }
        }

        while(q.size() != 0){
            if(q.pop() == target) answer++;
        }
        System.out.println(answer);


    }
}
