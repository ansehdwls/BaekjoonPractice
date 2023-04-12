import java.util.LinkedList;
import java.util.Stack;

public class ShortPathGame {
    
    public static void main(String args[]){

        int map[][] = { {1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int answer = -99999;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(0);
        q.add(0);
        map[0][0] = -1;
        while(q.size() != 0){
            int x = q.pop();
            int y = q.pop();
            if(x == map[0].length-1  && map.length-1 == y ){
                map[map[0].length-1][map.length-1] = 1;
                if( answer < map[map[0].length-1][map.length-1] ) {
                    answer = map[map[0].length-1][map.length-1];
                }
            }
            System.out.println(x);
            System.out.println(y);
            if(x-1 > -1){
                if(map[x-1][y] == 1){
                    map[x-1][y] = map[x][y] -1;
                    q.add(x-1);
                    q.add(y);
                }
            }
            if(y-1 > -1){
                if(map[x][y-1] == 1){
                    map[x][y-1] =  map[x][y] -1;
                    q.add(x);
                    q.add(y-1);
                }
            }
            if(x+1 < map[map.length-1].length){
                if(map[x+1][y] == 1){
                    map[x+1][y] =  map[x][y] -1;
                    q.add(x+1);
                    q.add(y);
                }
            }
            if(y+1 < map.length){
                if(map[x][y+1] == 1){
                    map[x][y+1] =  map[x][y] -1;
                    q.add(x);
                    q.add(y+1);
                }
            }
        }
        answer *= -1 ;
        if(answer != 99999) System.out.println(answer);
        else System.out.println(-1);
    }
}
