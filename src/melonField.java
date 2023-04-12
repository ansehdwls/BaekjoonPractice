import java.util.Scanner;

public class melonField {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int res[] = new int[6];

        int rectengleR = 0;
        int rectengleC = 0;
        int melon = sc.nextInt();
        int max = 0;
        int idx = 0;
        for(int i = 0 ; i < 6 ; i++){
            sc.nextInt();

            res[i] = sc.nextInt();

            if(max < res[i]){
                 max = res[i];
                idx = i;
            }
        }
        int x = 0;
        int y = 0;
        if(idx-1 < 0) x = 6 + (idx-1);
        if(idx-2 < 0) y = 6 + (idx-2);
        System.out.println((res[x] * res[y]  +  res[(idx+1)%6] * res[(idx+2)%6] ) * melon);
    }
}
