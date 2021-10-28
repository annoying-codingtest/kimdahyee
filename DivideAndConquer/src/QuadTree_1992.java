import java.io.*;
import java.util.*;
public class QuadTree_1992 {

	static int[][] board; // 흰 점 0, 검은 점 1
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				board[i][j] = s.charAt(j) - '0';
			}
		}
		
		partition(0, 0, n);
		System.out.print(sb);
	}
	
	public static void partition(int row, int col, int size) {
		if (check(row, col, size)) {
			if (board[row][col] == 0) {
				sb.append(0);
			} else {
				sb.append(1);
			}
			return;
		}
		
		int k = size / 2;
		
		sb.append("(");
		partition(row, col, k); 
		partition(row, col + k, k); 
		partition(row + k, col, k); 
		partition(row+ k, col + k, k); 
		sb.append(")");
	}
	
	public static boolean check(int row, int col, int size) {
		int first = board[row][col];
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (board[i][j] != first) {
					return false;
				}
			}
		}
		return true;
	}

}
