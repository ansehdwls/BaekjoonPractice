import java.util.Scanner;

public class CountinueSum {
    static int num[];
    static int cache[];
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        num = new int [n];

        int j = 0; // num집합 point
        
        for(int i = 0 ; i < n ; i++) // 음수는 스탑. 양수일 때 양수끼리 모으자
        {
            int a = sc.nextInt();
            
            if(i == 0) {
                num[j] = a;
                j++;
            }
            else{
                if(num[j-1] < 0) // 음수
                {
                        num[j] = a;
                        j++;
                }
                else // 양수
                {
                    if(a >= 0) num[j-1] += a;
                    else{
                        num[j] = a;
                        j++;
                    }
                }
            }
        }
        // max 값을 찾아보자.
        cache = new int [n]; // i번까지의 최대값을 저장해 두자.
        for(int i = 0 ; i < n ; i++) cache[i] = -1001; // 초기화.

        cache[0] = num[0];
        maxNum(n-1); // top - down cache를 구하자.

        int max = -1001;
        for(int i = 0 ; i < n; i++){
            max = Math.max(max, cache[i]);
        }
        
        System.out.println(max);
    }

    public static int maxNum(int n)
    {
        if(cache[n] != -1001 ); // 최대값 그대로 출력
        else {
            cache[n] = Math.max(maxNum(n-1) + num[n], num[n]); // n-1 번까지의 최대합 + 현재값과 현재값의 상태를 비교함.
        }
        return cache[n];
    }
}
