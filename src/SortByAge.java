import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
public class SortByAge {
    public static class OnlineJudge {
        int age;
        String name;
        
        public OnlineJudge(int age, String name) {
            this.age = age;
            this.name = name;
        }
        
        public int age() {
            return age;
        } 
        
        public String name() {
            return name;
        } 
    }    
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        OnlineJudge A[] = new OnlineJudge[N] ;
        for(int i = 0 ; i < N ; i++){
            A[i] = new OnlineJudge(sc.nextInt(),sc.next());
        }
        
        Arrays.sort(A, new Comparator<OnlineJudge>() {
			public int compare(OnlineJudge s1, OnlineJudge s2) {
				return s1.age - s2.age;
			}
		});
        
        for(int i = 0 ; i < N ; i++){
            System.out.println(A[i].age() + " " + A[i].name());
        }
    }
}
