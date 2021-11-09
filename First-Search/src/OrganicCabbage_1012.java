import java.io.*;
import java.util.*;

public class OrganicCabbage_1012 {

	static int n, m, k, count = 0;
	static int[][] map;
	static boolean[][] checked;
	static int dx[] = {0, 0, -1, 1}; // 하 상 우 좌
    static int dy[] = {-1, 1, 0, 0};
    static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// main에서 BufferedReader 한 번 생성하고 내부 메소드에서 또 한 번 생성했더니 nextToken없다는 오류 발생함
		// 원인 알아보기 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		while (testCase --> 0) {
			count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			map = new int[n][m];
			checked = new boolean[n][m];
			
			while (k --> 0) { // k번
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[x][y] = 1;
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == 1 && !checked[i][j]) {
						dfs(i, j);
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

	public static void dfs(int x, int y) {
		checked[x][y] = true;
		
		for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                if(map[nx][ny] == 1 && !checked[nx][ny]){
                    dfs(nx, ny);
                }
            }
        }
	}

}
