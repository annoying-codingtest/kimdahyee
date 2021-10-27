import java.util.*;
import java.io.*;
public class ColorPaper_2630 {

	static int blueCount = 0, whiteCount = 0;
	static boolean[][] colors;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		colors = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				if (Integer.parseInt(st.nextToken()) == 0) { // white
					colors[i][j] = true;
				} else { // blue
					colors[i][j] = false;
				}
			}
		}
		
		partition(0, 0, n);
		
		System.out.println(whiteCount);
		System.out.println(blueCount);
		
	}
	
	public static void partition(int row, int col, int size) {
		if (check(row, col, size)) {
			if (colors[row][col]) { // first true -> white
				whiteCount++;
			} else {
				blueCount++;
			}
			return;
		} 
		
		int k = size / 2;
		
		partition(row, col, k); // 1사분면
		partition(row, col + k, k); // 2사분면
		partition(row + k, col, k); // 3사분면
		partition(row+ k, col + k, k); // 4사분면
	}

	public static boolean check(int row, int col, int size) {
		boolean first = colors[row][col];
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (colors[i][j] != first) {
					return false;
				}
			}
		}
		return true;
	}

}
