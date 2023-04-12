import java.util.Scanner;

public class VeritySudoku {
    static int sudoku[][];
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t = 1 ; t < T+1 ;t++){
            sudoku = new int[9][9];
            boolean isTrue = true;
            for(int i = 0 ; i < 9; i++){
                int sum = 0;
                for(int j = 0 ; j < 9; j++)
                {
                    sudoku[i][j] = sc.nextInt();
                    sum += sudoku[i][j];
                    if(sum != 45) isTrue = false;
                }
            }
            for(int i = 0 ; i < 9; i++){
                int sum = 0;
                for(int j = 0 ; j < 9; j++)
                {
                    sum += sudoku[j][i];
                    if(sum != 45) isTrue = false;
                }
            }
            for(int i = 0 ; i < 7; i = i + 3){
                for(int j = 0 ; j < 7; i = j + 3)
                if( !mid(i,j) ) {
                    isTrue = false;
                    break;
                }
                if(!isTrue) break;
            }
            
        }
    }
    public static boolean mid(int a , int b){
        for(int i = a ; i < 3+a; i++){
            int sum = 0;
            for(int j = b ; j < b+3; j++)
            {
                sum += sudoku[j][i];
                if(sum != 45) return false;
            }
        }
        return true;
    }
}
