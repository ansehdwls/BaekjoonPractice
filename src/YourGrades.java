import java.util.Scanner;

public class YourGrades {
    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        float Sum = 0;
        float Den = 0;
        for(int i = 0 ; i < 20 ; i++){
            String a = sc.next();
            float Agrade = sc.nextFloat();
            String Cgeade = sc.next();
            if(!isPass(Cgeade)){
                Sum += grade(Agrade, Cgeade);
                Den += Agrade;
            }
        }

        System.out.printf("%.6f",Sum/Den);

    }

    public static boolean isPass(String a){

        if(a.equals("P")) return true;
        else return false;

    }
    public static float grade(float i, String a){
        float j = 0;
        if(a.equals("A+")) j = 4.5f;
        else if(a.equals("A0")) j = 4;
        else if(a.equals("B+")) j = 3.5f;
        else if(a.equals("B0")) j = 3;
        else if(a.equals("C+")) j = 2.5f;
        else if(a.equals("C0")) j = 2;
        else if(a.equals("D+")) j = 1.5f;
        else if(a.equals("D0")) j = 1;
        else return 0;

        return i * j;

    }
}
