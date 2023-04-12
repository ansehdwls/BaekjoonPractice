import java.util.LinkedList;
import java.util.Scanner;

public class conCave {
    static int game[][];
    static int res[];
    static int cos[];
    public static void main(String ars[]) {

        Scanner sc = new Scanner(System.in);
        game = new int[19][19];
        res = new int[3];
        cos  = new int[3];
        for (int i = 0; i < 19; i++)
            for (int j = 0; j < 19; j++)
                game[i][j] = sc.nextInt();

        boolean isFIrstWin = CheckWin(1);
        boolean isSecondWin = CheckWin(2);
        if(isFIrstWin && isSecondWin) System.out.println(0);
        else if(isFIrstWin)
            {
                System.out.println(1);
                System.out.println(res[1] + " " +cos[1]);
            }
        else if( isSecondWin){
            System.out.println(2);
            System.out.println(res[2] + " " +cos[2]);
        }
        else System.out.println(0);
    }
    public static boolean CheckWin(int n){
        
        LinkedList<Integer> q = new LinkedList<>();
        // 가로
        for(int i = 0 ; i < 19 ; i++){
            for(int j = 0 ; j < 19 ; j++){
                if( game[i][j] == n){
                    q.add(i);
                    q.add(j);
                }
            }
        }
        while(q.size() != 0){
            int x = q.poll();
            int y = q.poll();
            int isConnect = 1;
            for(int i = 1 ; i < 5 ; i++)
            {
                if(y+i == 19) break;
                if(game[x][y+i] == n) isConnect++;
                else break;
            }
            if(isConnect == 5) {
                res[n] = x+1;
                cos[n] = y+1;
                if(y-1 > -1){
                    if(game[x][y-1] == n) isConnect = 1;
                }
                if(y+5 < 19){
                    if(game[x][y+5] == n) isConnect = 1;
                }
                
                if(isConnect == 5) return true;

            }
            else isConnect = 1;

            // 세로
            for(int i = 1 ; i < 5 ; i++)
            {
                if(x+i == 19) break;
                if(game[x+i][y] == n) isConnect++;
                else break;
            }
            if(isConnect == 5) {
                res[n] = x+1;
                cos[n] = y+1;
                if(x-1 > -1){
                    if(game[x-1][y] == n) isConnect = 1;
                }
                if(x+5 < 19){
                    if(game[x+5][y] == n) isConnect = 1;
                }
                
                if(isConnect == 5) return true;
            }
            else isConnect = 1;
            // 대각선

            for(int i = 1 ; i < 5 ; i++)
            {
                if(x+i == 19 || y+i == 19) break;
                if(game[x+i][y+i] == n) isConnect++;
                else break;
            }
            if(isConnect == 5) {
                res[n] = x+1;
                cos[n] = y+1;
                if(x-1 > -1 && y-1 > -1){
                    if(game[x-1][y-1] == n) isConnect = 1;
                }
                if(x+5 < 19 && y+5 < 19){
                    if(game[x+5][y+5] == n) isConnect = 1;
                }
                if(isConnect == 5) return true;
            }
            else isConnect = 1;

            for(int i = 1 ; i < 5 ; i++)
            {
                if(x+i == 19 || y-i == -1) break;
                if(game[x+i][y-i] == n) isConnect++;
                else break;
            }
            if(isConnect == 5) {
                res[n] = x+5;
                cos[n] = y-3;
                if(x-1 > -1 && y+1 < 19){
                    if(game[x-1][y+1] == n) isConnect = 1;
                }
                if(x+5 < 19 && y-5 > -1){
                    if(game[x+5][y-5] == n) isConnect = 1;
                }
                if(isConnect == 5) return true;
            }
        }        
    return false;
    }
}
