import java.io.*;
import java.util.*;

public class Numbering_2667 {
	
	static int n, start, count = 0;
	static int[][] map;
	static boolean[][] checked;
	static int dx[] = {0, 0, -1, 1}; // 상 하 좌 우
    static int dy[] = {-1,1, 0, 0};
	static ArrayList<Integer> arr = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine()); // 정점의 개수
		
		map = new int[n + 1][n + 1];
		checked = new boolean[n + 1][n + 1];
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && !checked[i][j]) {
					dfs(i, j);
					arr.add(count);
					count = 0;
				}
			}
		}
		
		Collections.sort(arr);
		System.out.println(arr.size());

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
	
	public static void dfs(int x, int y) {
		checked[x][y] = true;
		count++;
		
		for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && !checked[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
	}

}
