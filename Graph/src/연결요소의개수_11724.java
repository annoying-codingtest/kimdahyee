import java.util.*;
import java.io.*;
public class 연결요소의개수_11724 {

	public static int n, m, count = 0;
	public static int[][] adj;
	public static boolean[] checked;
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		adj = new int[1001][1001]; // n + 1도 상관 x
		checked = new boolean[1001];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			adj[x][y] = adj[y][x] = 1;
		}

		for (int i = 1; i <= n; i++) {
			if (!checked[i]) { // 값이 1일 필요없이 모든 정점을 일단 탐색
				dfs(i);
				count++;
			}
		}

		System.out.print(count);
		
	}

	public static void dfs(int k) {
		checked[k] = true;
		for (int i = 1; i <= n; i++) {
			if (adj[k][i] == 1 && checked[i] == false) {
				dfs(i);
			}
		}
	}
}
