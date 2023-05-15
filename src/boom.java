import java.util.*;

public class boom {
    
	static int line[];
	static int line1[];
	static int boom[];
	static LinkedList<Integer> q;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1 ; test_case < T+1 ; test_case++ ) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			line = new int[N+1];
			line1 = new int[N+1];
			q = new LinkedList<>();
			for(int i = 1 ; i < N+1 ; i++) {
				line[i] = sc.nextInt();
				line1[i] = line[i];
			}
			q.add(M);
			int a = 0;
			while(q.size() != 0 ) {
				int i = q.poll();
				if(i == M) {
					if( i-1 > 0) q.add(i-1);
					if( i+1 < N+1) q.add(i +1);
				}
				else if(M > i && i-1 > 0) q.add(i-1);
				else if(M < i && i+1 < N+1) q.add(i+1);
				
				if(isBoom(i,N)) same(N);
				else {
					if(M > i) a = M -i;
					else a = i-M;
					break;
				}
			}
			System.out.println(a);
		}
	}
	public static boolean isBoom(int i,int N) {
		int boom = 0;
		if(i == 1 || i == N) return false;
		for(int j = 1 ; j < N + 1 ; j++) {
			if(line1[j] == 1) boom++;
		}
		if(boom == 0) return false;
		int a = 0;
		int b = 0;
		line1[i] = 0;
		for(int j = i+1 ; j < N+1 ; j++) {
			if(line1[j] == 1) break;
			else a++;
		}
		for(int j = i-1 ; j > -1 ; j--) {
			if(line1[j] == 1) break;
			else b++;
		}
		
		if(a == b)  return true;
		else {
			if(a < b) return isBoom(a,N);
			else return isBoom(b,N);
		}
	}
	public static void same(int N) {
		for(int i = 1 ; i < N+1 ; i++) line1[i] = line[i];
	}
}

