import java.util.*;
import java.io.*;
// 미완
class node {
    String data;
    node rightNode;
    node leftNode;
}

class tree {

    node root;

    node getRoot() {
        return root;
    }

    void setRoot(node root) {
        this.root = root;
    }

    void makeNode(String data, node left, node right) {
        node newNode = new node();
        newNode.data = data;
        newNode.leftNode = left;
        newNode.rightNode = right;
    }
}

public class TreeOrderL {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String ars[]) throws IOException {

        int n = Integer.parseInt(br.readLine());
        tree A = new tree();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (A.getRoot() == null) {
                String data = st.nextToken();
                node temp = new node();
                temp.data = data;
                temp.leftNode = null;
                temp.rightNode = null;
                A.setRoot(temp);
            } else {

            }
        }
    }
}
