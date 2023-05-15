import java.util.Scanner;

public class RGB {
    static int RGB[][];
    static int cache[][];
    static int N;
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        RGB = new int [N][3];
        cache = new int [N+1][3];
        for(int i = 0 ; i < N ; i++){
            RGB[i][0] = sc.nextInt();
            RGB[i][1] = sc.nextInt();
            RGB[i][2] = sc.nextInt();
        }

        int min = Math.min(minCost(0,N-1),minCost(1,N-1));
        System.out.println(Math.min(min, minCost(2,N-1)));
    }

    public static int minCost(int num, int start){
        if(start == 0) {
            if(num == 0) return RGB[0][0];
            else if(num == 1) return RGB[0][1];
            else return RGB[0][2];
        }

        if(cache[start][num] == 0){

            if(num == 0) cache[start][num] = RGB[start][0] + Math.min(minCost(1, start-1), minCost(2, start-1));
            else if(num == 1) cache[start][num] = RGB[start][1] + Math.min(minCost(0, start-1), minCost(2, start-1));
            else cache[start][num] = RGB[start][2] + Math.min(minCost(0, start-1), minCost(1, start-1));
        }

        return cache[start][num];
    }
}
