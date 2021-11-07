import java.util.*;
import java.io.*;
public class Virus_2606 {

	static int[][] map;
	static boolean[] checked;
	static int start = 1, count = 0;
	static int computer, edge;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		computer = Integer.parseInt(br.readLine()); // 정점의 개수
		edge = Integer.parseInt(br.readLine()); // 간선의 개수
		
		map = new int[computer + 1][computer + 1];
		checked = new boolean[computer + 1];
		
		for (int i = 0; i < edge; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[x][y] = map[y][x] = 1;
		}
		
		dfs(start);
		
		System.out.print(count - 1);
	}
	
	public static void dfs(int k) {
		count++;
		checked[k] = true;
		
		for (int i = 1; i <= computer; i++) {
			if (map[k][i] == 1 && !checked[i]) {
				dfs(i);
			}
		}
	}
}
