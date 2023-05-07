import java.util.Scanner;

public class VIEW {
    
    public static void main(String ars[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 10 ; i ++){

            int n = sc.nextInt();
            int building[] = new int[n];

            for(int j = 0 ; j < n ; j++){
                building[j] = sc.nextInt();
            }
            int res = 0;
            int max = 0;
            for(int j = 0 ; j < n ; j++){
                int a = building[j];
                if(j == 0){
                    max =  Math.max(building[j+1], building[j+2]);
                    if(a > max ) res += a-max;
                }   
                else if(j == 1){
                    max = Math.max(building[j+1], building[j+2]);
                    max = Math.max(max,building[j-1]);
                    if(a > max ) res += a-max;
                }
                else if(j == n-1){
                    max =  Math.max(building[j-1], building[j-2]);
                    if(a > max ) res += a-max;
                }
                else if(j == n-2){
                    max = Math.max(building[j-1], building[j-2]);
                    max = Math.max(max,building[j+1]);
                    if(a > max ) res += a-max;
                }
                else{
                    max = Math.max(building[j-1], building[j-2]);
                    max = Math.max(max, building[j+2]);
                    max = Math.max(max, building[j+1]);
                    if(a > max ) res += a-max;
                }
            }
            System.out.println(res);
        
    }
    }
}
