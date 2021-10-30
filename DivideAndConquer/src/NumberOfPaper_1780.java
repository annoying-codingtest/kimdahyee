import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class NumberOfPaper_1780 {
	
	static int minusCount = 0, zeroCount = 0, plusCount = 0;
	static int[][] board;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				String input = st.nextToken();
				if (input.equals("-1")) { // 2로 저장
					board[i][j] = 2;
				} else {
					board[i][j] = Integer.parseInt(input);
				}
			}
		}
		
		partition(0, 0, n);
		
		System.out.println(minusCount);
		System.out.println(zeroCount);
		System.out.println(plusCount);
		
	}
	
	public static void partition(int row, int col, int size) {
		if (check(row, col, size)) {
			if (board[row][col] == 0) {
				zeroCount++;
			} else if (board[row][col] == 1) {
				plusCount++;
			} else {
				minusCount++;
			}
			return;
		}
		
		int k = size / 3;
		
		partition(row, col, k);
		partition(row, col + k, k);
		partition(row, col + 2*k, k);
		partition(row + k, col, k);
		partition(row + k, col + k, k);
		partition(row + k, col + 2*k, k);
		partition(row + 2*k, col + k, k);
		partition(row + 2*k, col, k);
		partition(row + 2*k, col + 2*k, k);		
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
