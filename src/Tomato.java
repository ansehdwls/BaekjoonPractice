import java.util.LinkedList;
import java.util.Scanner;

public class Tomato {
    static int tomato[][][];
    static int checkTomato[][][];
    static int allTomatoReady = 0;
    static int numTomato = 0;

    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int h = sc.nextInt();

        tomato = new int[h][n][m];
        checkTomato = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    tomato[i][j][k] = sc.nextInt();
                    checkTomato[i][j][k] = tomato[i][j][k];
                    if (tomato[i][j][k] == 0) {
                        allTomatoReady++;
                        numTomato++;
                    }
                    if (tomato[i][j][k] == 1) {
                        numTomato++;
                    }
                }
            }
        }
        int day = 0;
        if (worstTomato(h, n, m)) {
            if (allTomatoReady == 0)
                day = 0;
            else
                day = -1;
        } else {
            while (true) {
                if (allTomatoReady == 0) {
                    break;
                }
                for (int i = 0; i < h; i++)
                    for (int j = 0; j < n; j++)
                        for (int k = 0; k < m; k++) {
                            checkTomato[i][j][k] = tomato[i][j][k];
                        }
                ripeTomato(h, n, m);
                day++;
            }
        }
        System.out.println(day);
    }

    public static void ripeTomato(int m, int n, int h) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < h; k++) {
                    if (checkTomato[i][j][k] == 1) {
                        if (i - 1 >= 0) {
                            if (tomato[i - 1][j][k] == 0) {
                                tomato[i - 1][j][k] = 1;
                                allTomatoReady--;
                            }

                        }
                        if (j - 1 >= 0) {
                            if (tomato[i][j - 1][k] == 0) {
                                tomato[i][j - 1][k] = 1;
                                allTomatoReady--;
                            }
                        }
                        if (k - 1 >= 0) {
                            if (tomato[i][j][k - 1] == 0) {
                                tomato[i][j][k - 1] = 1;
                                allTomatoReady--;
                            }
                        }
                        if (i + 1 < m) {
                            if (tomato[i + 1][j][k] == 0) {
                                tomato[i + 1][j][k] = 1;
                                allTomatoReady--;
                            }

                        }
                        if (j + 1 < n) {
                            if (tomato[i][j + 1][k] == 0) {
                                tomato[i][j + 1][k] = 1;
                                allTomatoReady--;
                            }
                        }
                        if (k + 1 < h) {
                            if (tomato[i][j][k + 1] == 0) {
                                tomato[i][j][k + 1] = 1;
                                allTomatoReady--;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean worstTomato(int m, int n, int h) {
        LinkedList<Integer> q = new LinkedList<>();
        int isTomatoConnect = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < h; k++) {
                    if (checkTomato[i][j][k] == 1) {
                        q.add(i);
                        q.add(j);
                        q.add(k);
                        checkTomato[i][j][k] = -1;
                    }
                }
            }
        }
        while (q.size() != 0) {
            int i = q.poll();
            int j = q.poll();
            int k = q.poll();
            isTomatoConnect++;
            if (i - 1 >= 0) {
                if (checkTomato[i - 1][j][k] > -1) {
                    q.add(i - 1);
                    q.add(j);
                    q.add(k);
                    checkTomato[i - 1][j][k] = -1;
                }

            }
            if (j - 1 >= 0) {
                if (checkTomato[i][j - 1][k] > -1) {
                    q.add(i);
                    q.add(j - 1);
                    q.add(k);
                    checkTomato[i][j - 1][k] = -1;
                }
            }
            if (k - 1 >= 0) {
                if (checkTomato[i][j][k - 1] > -1) {
                    q.add(i);
                    q.add(j);
                    q.add(k - 1);
                    checkTomato[i][j][k - 1] = -1;
                }
            }
            if (i + 1 < m) {
                if (checkTomato[i + 1][j][k] > -1) {
                    q.add(i + 1);
                    q.add(j);
                    q.add(k);
                    checkTomato[i + 1][j][k] = -1;
                }

            }
            if (j + 1 < n) {
                if (checkTomato[i][j + 1][k] > -1) {
                    q.add(i);
                    q.add(j + 1);
                    q.add(k);
                    checkTomato[i][j + 1][k] = -1;
                }
            }
            if (k + 1 < h) {
                if (checkTomato[i][j][k + 1] > -1) {
                    q.add(i);
                    q.add(j);
                    q.add(k + 1);
                    checkTomato[i][j][k + 1] = -1;
                }
            }
        }
        if (isTomatoConnect == numTomato)
            return false;
        else
            return true;
    }
}