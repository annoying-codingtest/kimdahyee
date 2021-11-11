import java.util.*;
import java.io.*;

class Tomato {
	int x, y, z;
	
	public Tomato(int z, int x, int y) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

public class Tomato2_7569 {

	static int n, m, h;
	static int[][][] map;
	static int[] dx = {0, 0, 0, 0, -1, 1};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int[] dz = {-1, 1, 0, 0, 0, 0};
	// 위 아래 앞 뒤 왼 오
	static Queue<Tomato> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken()); // 가로
		n = Integer.parseInt(st.nextToken()); // 세로
		h = Integer.parseInt(st.nextToken()); // 높이
		
		map = new int[h][n][m]; // h층의 n, m
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < m; k++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());
					
					if (map[i][j][k] == 1) {
						q.offer(new Tomato(i, j, k));
					}
				}
			}
		}
		
		System.out.println(bfs());
	}
	
	public static int bfs() {
		while (!q.isEmpty()) {
			Tomato t = q.poll();
			int cx = t.x;
			int cy = t.y;
			int cz = t.z;
			
			for (int i = 0; i < 6; i ++) {
				int nx = cx + dx[i];
                int ny = cy + dy[i];
                int nz = cz + dz[i];
                
                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < n && ny < m && nz < h) {
                    if (map[nz][nx][ny] == 0) { 
                        q.offer(new Tomato(nz, nx, ny));
                        map[nz][nx][ny] = map[cz][cx][cy] + 1;
                    }
                }
			}
		}
		
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (map[i][j][k] == 0) {
						return -1;
					}
					result = Math.max(result, map[i][j][k]);
				}
			}
		}
		
		if (result == 1) {
			return 0;
		} else {
			return result - 1;
		}
	}
	
}

