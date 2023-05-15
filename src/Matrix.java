import java.util.Scanner;

public class Matrix {
    static int MatA[][];
    static int MatB[][];
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int s = sc.nextInt();


        MatA = new int[r][s];
        MatB = new int[r][s];

        for(int i = 0 ; i < r ; i++){
            String mat = sc.next();
            for(int j = 0 ; j < s ; j++)
            MatA[i][j] = mat.charAt(j) - '0';
        }

        for(int i = 0 ; i < r ; i++){
            String mat = sc.next();
            for(int j = 0 ; j < s ; j++)
            MatB[i][j] = mat.charAt(j) -'0';
        }
        int ans = 0;

        if(r < 3 || s < 3){

            for(int i = 0 ; i < r ; i++){
                for(int j = 0 ; j < s ; j++){
                    if(MatA[i][j] != MatB[i][j]){
                        System.out.println(-1);
                        return;
                    }
                }
            }
            System.out.println(0);
            return;
        }


        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < s ; j++){
                if( i > r-3 || j > s-3){
                    if(MatA[i][j] != MatB[i][j] ) {
                        System.out.println(-1);
                        return;
                    }
                }
                if(MatA[i][j] != MatB[i][j]) {
                    change(i, j);
                    ans++;
                }

            }
            
        }

        System.out.println(ans);


    }

    public static void change(int i , int j){
        for(int x = i ; x < i+3 ; x++){
            for(int y = j ; y < j+3 ; y++){
                if(MatA[x][y] == 0) MatA[x][y] = 1;
                else MatA[x][y] = 0;
            }
        }
    }
}
