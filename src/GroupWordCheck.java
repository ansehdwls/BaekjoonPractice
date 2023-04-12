import java.util.Scanner;

public class GroupWordCheck {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wordNum = 0;
        for(int i = 0 ; i < n ; i++){

            String a = sc.next();
            int groupNum[] = new int[26];
            int b = (int) a.charAt(0) - 97;
            groupNum[b]++;
            boolean isGroup = true;
            for(int j = 1 ; j < a.length() ; j++){
                if( b != (int) a.charAt(j) - 97){
                    b =  a.charAt(j) - 97;
                    groupNum[b]++;
                }
                if(groupNum[b] > 1) {
                    isGroup = false;
                    break;
                }
            }
            if(isGroup) wordNum++;
        }

        System.out.println(wordNum);

    }
}
