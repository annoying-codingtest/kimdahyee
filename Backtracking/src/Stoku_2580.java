import java.io.*;
import java.util.StringTokenizer;
public class Stoku_2580 {

	static int[][] arr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		arr = new int[9][9];
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		stoku(0, 0);
	}

	public static void stoku(int row, int col) { 		
		if (col == 9) {
			// 현재 행의 값이 다 채워졌으면 다음 행 탐색 호출
			stoku(row + 1, 0);
			return; 
		}
		
		if (row == 9) {
			// 모든 행 탐색을 완료하면 출력 후 시스템 종료
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.print(sb);
			System.exit(0); // 프로그램 강제 종료
		}
		
		if (arr[row][col] == 0) { 
			for (int i = 0; i < 9; i++) {
				if (check(row, col, i + 1)) { 
					// 0 ~ 9까지 해당 빈칸에 들어갈 수 있는지 확인
					arr[row][col] = i + 1; // 들어갈 수 있으면 값 넣고
					stoku(row, col + 1); // 다음 열 탐색 호출
				}
			}
			arr[row][col] = 0;
			return;
		}
		
		stoku(row, col + 1); // 빈칸이 아니면 다음 열 탐색
	}
	
	public static boolean check(int row, int col, int value) {
		// value값이 해당 칸에 들어가도 되는지를 확인해주는 함수
		
		for (int i = 0 ; i < 9; i++) {
			if (arr[row][i] == value) { // 세로 체크
				return false;
			}
		}
		
		for (int i = 0 ; i < 9; i++) {
			if (arr[i][col] == value) { // 가로 체크
				return false;
			}
		}
		
		int s_row = (row / 3) * 3; // 3x3의 시작점
		int s_col = (col / 3) * 3;
		
		for (int i = s_row; i < s_row + 3; i++) {
			for (int j = s_col; j < s_col + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
		
		return true;
	}
}
