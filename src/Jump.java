import java.util.Scanner;

public class Jump {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int puzzleBoard[][] = new int [N][N];
        long visit[][] = new long [N][N];
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++)
                puzzleBoard[i][j] = sc.nextInt();
        }
        visit[0][0] = 1;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++)
            {
                int jump = puzzleBoard[i][j];

                if(jump != 0){
                    if(i + jump < N) visit[i+jump][j] += visit[i][j];
                    if(j + jump < N) visit[i][j+jump] += visit[i][j];
                }
            }
        }

        System.out.println(visit[N-1][N-1]);

    }
}
