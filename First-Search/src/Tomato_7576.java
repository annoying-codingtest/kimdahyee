import java.util.*;
import java.io.*;
public class Tomato_7576 {

	static int n, m;
	static int[][] map;
	static boolean[][] checked;
	static int dx[] = {0, 0, -1, 1}; // 하 상 우 좌
    static int dy[] = {-1, 1, 0, 0};
    static Queue<int[]> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[m][n];
		checked = new boolean[m][n];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if (map[i][j] == 1) {
					q.offer(new int[] {i, j});
				}
			}
		}
		
		System.out.println(bfs());
		
	}
	
	public static int bfs() {		
		while (!q.isEmpty()) {
			int c[] = q.poll();
			int cx = c[0];
            int cy = c[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    if (map[nx][ny] == 0 && !checked[nx][ny]) { 
                        q.offer(new int[] {nx, ny});
                        checked[nx][ny] = true;
                        map[nx][ny] = map[cx][cy] + 1;
                    }
                }
            }
		}
		
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0) { // 모두가 익지 못하는 상황이라면
					return -1;
				}
				result = Math.max(result, map[i][j]);
			}
		}
		
		if (result == 1) {
			return 0;
		} else {
			return result - 1;
		}
		
	}

}
