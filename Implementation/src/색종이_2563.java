import java.util.*;
import java.io.*;
public class 색종이_2563 {

	static int[][] map = new int[101][101];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			fill(x, y);
		}
		
		int size = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 1) {
					size += map[i][j];
				}
			}
		}
		System.out.println(size);
	}

	public static void fill(int x, int y) {
		int dx = x + 10;
		int dy = y + 10;
		
		for (int i = x; i < dx; i++) {
			for (int j = y; j < dy; j++) {
				map[i][j] = 1;
			}
		}
	}
}
