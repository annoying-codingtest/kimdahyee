import java.util.*;
import java.io.*;
class Position {
	int x, y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Knight_7562 {
	
	static int l;
	static int[][] map;
	static boolean[][] checked;
	
	static int dx[] = {1, 2, 2, 1, -1, -2, -2, -1}; 
	static int dy[] = {2, 1, -1, -2, -2, -1, 1, 2};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			l = Integer.parseInt(br.readLine());
			
			map = new int[l][l];
			checked = new boolean[l][l];
			
			Position[] p = new Position[2];
			for (int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				p[j] = new Position(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			
			bfs(p);
			
			sb.append(map[p[1].x][p[1].y]).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void bfs(Position[] p) {
		Queue<Position> q = new LinkedList<>();
		
		q.offer(p[0]);
		map[p[0].x][p[0].y] = 0;
		checked[p[0].x][p[0].y] = true;
		
		while(!q.isEmpty()) {
			Position pos = q.poll();
			int cx = pos.x;
			int cy = pos.y;
			
			for (int i = 0; i < 8; i ++) {
				int nx = cx + dx[i];
                int ny = cy + dy[i];
				
				if (nx >= 0 && ny >= 0 && nx < l && ny < l) {
					if (!checked[nx][ny]) {
						q.offer(new Position(nx, ny));
						checked[nx][ny] = true;
						map[nx][ny] = map[cx][cy] + 1;
					}
				}
			}
			
			if (cx == p[1].x && cy == p[1].y) {
				return;
			}
		}
	}

}
