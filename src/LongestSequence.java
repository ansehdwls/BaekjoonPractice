import java.util.Scanner;

public class LongestSequence {

    public static void main(String ars[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int Seq[] = new int[N];
        int cache[] = new int[N];

        for (int i = 0; i < N; i++)
            Seq[i] = sc.nextInt();
        cache[0] = 1;
        for (int i = 1; i < N; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (Seq[i] > Seq[j]) {
                    cache[i] = Math.max(cache[j] + 1, cache[i]);
                }
            }
            if (cache[i] == 0)
                cache[i] = 1;
        }
        int max = cache[0];
        for (int i = 1; i < N; i++) {
            if (max < cache[i])
                max = cache[i];
        }
        System.out.println(max);
    }
}
