
// 이것은 버그 입니다.
import java.util.LinkedList;
import java.util.Scanner;

public class IceBerg {
    static int iceberg[][];
    static int icemelt[][];
    static int checkIce[][];
    static int ice = 0;

    public static void main(String ars[]) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        iceberg = new int[m][n];
        icemelt = new int[m][n];
        checkIce = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                iceberg[i][j] = sc.nextInt();
                if (iceberg[i][j] == 0)
                    icemelt[i][j] = 0;
                else {
                    icemelt[i][j] = 1;
                    ice++;
                }
            }
        }

        int year = 0;
        while (true) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    checkIce[i][j] = icemelt[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (checkIce[i][j] != 0) {
                        meltIce(i, j, m, n);
                    }
                }
            }
            year++;
            if (isTwoBergs(m, n))
                break;
            if (ice == 0) {
                year = 0;
                break;
            }
        }

        System.out.println(year);
    }

    public static boolean isTwoBergs(int m, int n) {

        LinkedList<Integer> q = new LinkedList<>();
        int checkMelt[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                checkMelt[i][j] = icemelt[i][j];
            }
        }
        boolean t = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checkMelt[i][j] != 0) {
                    q.add(i);
                    q.add(j);
                    checkMelt[i][j] = 0;
                    t = false;
                    break;
                }
            }
            if(!t) break;
        }

        while (q.size() != 0) {
            int i = q.pop();
            int j = q.pop();
            if (i - 1 >= 0) {
                if (checkMelt[i - 1][j] != 0) {
                    q.add(i - 1);
                    q.add(j);
                    checkMelt[i - 1][j] = 0;
                }
            }
            if (i + 1 < m) {
                if (checkMelt[i + 1][j] != 0) {
                    q.add(i + 1);
                    q.add(j);
                    checkMelt[i + 1][j] = 0;
                }
            }
            if (j - 1 >= 0) {
                if (checkMelt[i][j - 1] != 0) {
                    q.add(i);
                    q.add(j - 1);
                    checkMelt[i][j - 1] = 0;
                }
            }
            if (j + 1 < n) {
                if (checkMelt[i][j + 1] != 0) {
                    q.add(i);
                    q.add(j + 1);
                    checkMelt[i][j + 1] = 0;
                }
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checkMelt[i][j] != 0) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void meltIce(int i, int j, int m, int n) {

        if (i - 1 >= 0) {
            if (checkIce[i - 1][j] == 0)
                iceberg[i][j]--;
        }
        if (i + 1 < m) {
            if (checkIce[i + 1][j] == 0)
                iceberg[i][j]--;
        }
        if (j - 1 >= 0) {
            if (checkIce[i][j - 1] == 0)
                iceberg[i][j]--;
        }
        if (j + 1 < n) {
            if (checkIce[i][j + 1] == 0)
                iceberg[i][j]--;
        }
        if (iceberg[i][j] <= 0) {
            icemelt[i][j] = 0;
            ice--;
        }

    }
}
