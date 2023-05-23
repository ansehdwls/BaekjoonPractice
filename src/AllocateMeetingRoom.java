import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class meetingRoom{
    int start;
    int finish;

    public meetingRoom(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
    public int getStart(){
        return this.start;
    }
    public int getFinsih(){
        return this.finish;
    }
}
public class AllocateMeetingRoom {
    static int N;

    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        meetingRoom[] room = new meetingRoom[N];

        int max = 0;
        for(int i = 0 ; i < N ; i++){
            room[i] = new meetingRoom(sc.nextInt(),sc.nextInt());
        }

        Arrays.sort(room, new Comparator<meetingRoom>() {
           @Override
           public int compare(meetingRoom a, meetingRoom b){
                if(a.getFinsih() == b.getFinsih()) return Integer.compare(a.getStart(), b.getStart());
                return Integer.compare(a.getFinsih(), b.getFinsih());
           } 
        });
        int finishTime = 0;

        for(int i = 0 ; i < N ; i++){
            if(room[i].start >= finishTime){
                finishTime = room[i].finish;
                max++;
            }
        }

        System.out.println(max);
        sc.close();
    }


}
