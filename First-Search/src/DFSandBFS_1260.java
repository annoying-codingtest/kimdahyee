import java.util.*;
public class DFSandBFS_1260 {

	static int n, m, start;
	static int[][] map;
	static boolean[] checked;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		start = s.nextInt();
		
		map = new int[1001][1001];
		checked = new boolean[1001];
		
		for (int i = 0; i < m; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			map[x][y] = map[y][x] = 1;
		}
		
		dfs(start);
		sb.append("\n");
		Arrays.fill(checked, false); // 초기화
		bfs();
		
		System.out.print(sb);
	}
	
	public static void dfs(int k) {
		checked[k] = true;
		sb.append(k).append(" ");
		
		for (int i = 1; i <= n; i++) {
			if (map[k][i] == 1 && checked[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		checked[start] = true;
		sb.append(start).append(" ");
		
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			for (int i = 1; i <= n; i++) {
				if (map[temp][i] == 1 && checked[i] == false) {
					queue.offer(i);
					checked[i] = true;
					sb.append(i).append(" ");
				}
			}
		}
	}

}
