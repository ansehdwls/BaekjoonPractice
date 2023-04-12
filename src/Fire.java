import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Fire {
    static String Matrix[][];
    static LinkedList<Integer> fire = new LinkedList<>();
    static LinkedList<Integer> man = new LinkedList<>();

    public static void main(String ars[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        Matrix = new String[R][C];
        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                Matrix[i][j] = s.substring(j, j + 1);
                if (Matrix[i][j].equals("J")) {
                    man.add(i);
                    man.add(j);
                }
                if (Matrix[i][j].equals("F")) {
                    fire.add(i);
                    fire.add(j);
                }
            }
        }
        int count = 0;
        boolean die = false;
        boolean escape = false;
        while (true) {
            if (die || escape)
                break;
            if (man.size() == 0)
                die = true;
            else {
                int n = man.size();
                for (int i = 0; i < n / 2; i++) {
                    int x = man.poll();
                    int y = man.poll();
                    if (Matrix[x][y].equals("F"))
                        ;
                    else {
                        if (x - 1 < 0 || x + 1 >= R || y - 1 < 0 || y + 1 >= C) {
                            escape = true;
                            break;
                        } else {
                            verify(x - 1, y);
                            verify(x + 1, y);
                            verify(x, y - 1);
                            verify(x, y + 1);
                        }
                    }
                }
            }
            if (fire.size() != 0) {
                int n = fire.size();
                for (int i = 0; i < n / 2; i++) {
                    int x = fire.poll();
                    int y = fire.poll();
                    if (x - 1 < 0)
                        ;
                    else
                        f(x - 1, y);
                    if (x + 1 >= R)
                        ;
                    else
                        f(x + 1, y);
                    if (y - 1 < 0)
                        ;
                    else
                        f(x, y - 1);
                    if (y + 1 >= C)
                        ;
                    else
                        f(x, y + 1);
                }
            }
            count++;

        }
        if (die)
            System.out.println("IMPOSSIBLE");
        else
            System.out.println(count);
    }

    public static void verify(int x, int y) {
        if (Matrix[x][y].equals("#"))
            ;
        else if (Matrix[x][y].equals("F"))
            ;
        else if (Matrix[x][y].equals("J"))
            ;
        else {
            Matrix[x][y] = "J";
            man.add(x);
            man.add(y);
        }
    }

    public static void f(int x, int y) {
        if (Matrix[x][y].equals("#"))
            ;
        else if (Matrix[x][y].equals("F"))
            ;
        else if (Matrix[x][y].equals("J")) {
            Matrix[x][y] = "F";
            fire.add(x);
            fire.add(y);
        } else {
            Matrix[x][y] = "F";
            fire.add(x);
            fire.add(y);
        }
    }
}
