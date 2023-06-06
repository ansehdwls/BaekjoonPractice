import java.util.LinkedList;
import java.util.Scanner;

class chicken{

    int x;
    int y;

    public chicken(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
}

class house{

    int x;
    int y;

    public house(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
}
public class ChickenStreet {
    
    public static void main(String ars){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int street[][] = new int [N][N];

        house h[] = new house[2*N];
        chicken c[] = new chicken[13];
        int nc = 0; 
        int nh = 0; 
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                street[i][j] = sc.nextInt();
                if(street[i][j] == 2){
                    c[nc] = new chicken(i,j);
                    nc++;
                }
                if(street[i][j] == 1){
                    h[nh] = new house(i, j);
                    nh++;
                }
            }
        }

        int chickenNum[] = new int [nc];

        for(int i = 0 ; i < nh ; i++){
            int x = h[i].getX();
            int y = h[i].getY();

            int n = 0; 
            int min = Math.abs(x - c[0].getX()) + Math.abs(y - c[0].getY());

            for(int j = 1 ; j < nc ; j++){

                int a = Math.abs(x - c[j].getX()) + Math.abs(y - c[j].getY());

                if(min > a){
                    n = j;
                    min = a;
                }
            }
            chickenNum[n]++;
        }

    }
}
