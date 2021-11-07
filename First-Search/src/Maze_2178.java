import java.io.*;
import java.util.*;
public class Maze_2178 {

	static int n, m;
	static int[][] map;
	static boolean[][] checked;
	static int dx[] = {0, 0, -1, 1}; // 상 하 좌 우
    static int dy[] = {-1, 1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		
		map = new int[n + 1][m + 1];
		checked = new boolean[n + 1][m + 1];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = a.charAt(j) - '0';
			}
		}
		
		bfs(0, 0);
		System.out.println(map[n - 1][m - 1]);
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		checked[0][0] = true;
		q.offer(new int[] {x, y});
		
		while (!q.isEmpty()) {
			int c[] = q.poll();
			int cx = c[0];
            int cy = c[1];

            for (int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n){
                    if(map[nx][ny] == 1 && !checked[nx][ny]){
                        q.offer(new int[] {nx, ny});
                        map[nx][ny] = map[cx][cy] + 1;
                        checked[nx][ny] = true;
                    }
                }
            }
		}
	}

}
