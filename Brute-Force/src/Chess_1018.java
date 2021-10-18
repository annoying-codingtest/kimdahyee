import java.util.*;

public class Chess_1018 {
	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
 
		int n = s.nextInt(); 
		int m = s.nextInt(); 
		
		arr = new boolean[n][m];
		
		s.nextLine();
		
		for (int i = 0; i < n; i++) {
			String input = s.nextLine().trim();
			for (int j = 0; j < m; j++) {
				if (input.charAt(j) == 'B') {
					arr[i][j] = false;
				} else {
					arr[i][j] = true; // 'W'
				}
			}
		}
		
		int n_start = n - 7; // 8*8 체스판이 만들어질 수 있는 경우의 수
		int m_start = m - 7;
		
		for (int i = 0; i < n_start; i++) {
			for (int j = 0; j < m_start; j++) {
				check(i, j);
			}
		}
		
		System.out.println(min);
		
	}
	
	public static int check(int i, int j) { // n, m
		int count = 0;
		int n_end = i + 8;
		int m_end = j + 8;
		
		boolean first = arr[i][j];
		
		for (int k = i; k < n_end; k++) {
			for (int l = j; l < m_end; l++) {
				if (arr[k][l] != first) {
					count++;
				}
				
				first = (!first);
			}
			first = (!first);
		}
		
		count = Math.min(count, 64 - count); //W, B중 최소의 경우 찾기	
		min = Math.min(min, count); //전체 경우의 수 최소의 경우 찾기
		
		return min;
	}
}
