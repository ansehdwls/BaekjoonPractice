import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.UIDefaults.ProxyLazyValue;

public class UninhabitedTravel {
    
    public static void main(String ars[]){
    String maps[] = {"X591X","X1X5X","X231X", "1XXX1"};
    int map[][] = new int[maps[0].length()][maps.length];
    int mapTravel[][] = new int[maps[0].length()][maps.length];
    int wholeCount[] = new int[maps[0].length() * maps.length / 2];
    for(int i = 0 ; i < maps.length ; i++){
        for(int j = 0 ; j < maps[0].length() ; j++){
            map[j][i] = Count(maps,i,j);
            if(map[j][i] == 0) mapTravel[j][i] = -1;
            else mapTravel[j][i] = 0;
        }
    }
    int c = 0;
    while(true){
        Boolean chcek = false;
        LinkedList<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < maps[0].length() ; i++){
            for(int j = 0 ; j < maps.length ; j++){
                if(map[i][j] != 0) {
                    q.add(i);
                    q.add(j);
                    wholeCount[c] += map[i][j];
                    map[i][j] = 0 ;
                    chcek = true;
                }

                if(q.size() != 0) break;
            }
            if(q.size() != 0) break;
        }

        while(q.size()!= 0){
            int x = q.pop();
            int y = q.pop();

            if(x+1 < map.length){
                if(map[x+1][y] != 0){
                    q.add(x+1);
                    q.add(y);
                    wholeCount[c] += map[x+1][y];
                    map[x+1][y] = 0 ;
                }
            }
            if(x-1 > -1){
                if(map[x-1][y] != 0){
                    q.add(x-1);
                    q.add(y);
                    wholeCount[c] += map[x-1][y];
                    map[x-1][y] = 0 ;
                }
            }
            if(y+1 < map[0].length){
                if(map[x][y+1] != 0){
                    q.add(x);
                    q.add(y+1);
                    wholeCount[c] += map[x][y+1];
                    map[x][y+1] = 0 ;
                }
            }
            if(y-1 > -1){
                if(map[x][y-1] != 0){
                    q.add(x);
                    q.add(y-1);
                    wholeCount[c] += map[x][y-1];
                    map[x][y-1] = 0 ;
                }
            }
        }

        if(!chcek) break;
        c++;
    }

    Arrays.sort(wholeCount);
    if(wholeCount[wholeCount.length-1] == 0) System.out.println(-1);
    else {
        for(int i = 0 ; i < wholeCount.length ; i++){
            if(wholeCount[i] != 0){
                System.out.println(wholeCount[i]);
            }
        }
    }

    }

    public static int Count(String maps[], int x, int y){
        if(maps[x].charAt(y) == 'X') return 0;
        else if(maps[x].charAt(y) == '1') return 1;
        else if(maps[x].charAt(y) == '2') return 2;
        else if(maps[x].charAt(y) == '3') return 3;
        else if(maps[x].charAt(y) == '4') return 4;
        else if(maps[x].charAt(y) == '5') return 5;
        else if(maps[x].charAt(y) == '6') return 6;
        else if(maps[x].charAt(y) == '7') return 7;
        else if(maps[x].charAt(y) == '8') return 8;
        else return 9;

    }
}
