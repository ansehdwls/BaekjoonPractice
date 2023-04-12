public class rectengle {
    
    public static void main(String ars[]){
        int v[][] ={{1,3},{2,3},{2,10}};
        
        int num[] = new int [4];
        int answer[] = new int[2];
        num[0] = v[0][0];
        num[1] = v[0][1];
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < 3 ; i++){
            if(v[i][0] == num[0]) x++;
            else num[2] = v[i][0];
            if(v[i][1] == num[1]) y++;
            else num[3] = v[i][1];
        }
        if(x == 1) answer[0] = num[0];
        else answer[0] =num[2];
        if(y == 1) answer[1] = num[1];
        else answer[1] = num[3];

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
