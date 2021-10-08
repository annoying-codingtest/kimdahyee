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
			// ���� ���� ���� �� ä�������� ���� �� Ž�� ȣ��
			stoku(row + 1, 0);
			return; 
		}
		
		if (row == 9) {
			// ��� �� Ž���� �Ϸ��ϸ� ��� �� �ý��� ����
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.print(sb);
			System.exit(0); // ���α׷� ���� ����
		}
		
		if (arr[row][col] == 0) { 
			for (int i = 0; i < 9; i++) {
				if (check(row, col, i + 1)) { 
					// 0 ~ 9���� �ش� ��ĭ�� �� �� �ִ��� Ȯ��
					arr[row][col] = i + 1; // �� �� ������ �� �ְ�
					stoku(row, col + 1); // ���� �� Ž�� ȣ��
				}
			}
			arr[row][col] = 0;
			return;
		}
		
		stoku(row, col + 1); // ��ĭ�� �ƴϸ� ���� �� Ž��
	}
	
	public static boolean check(int row, int col, int value) {
		// value���� �ش� ĭ�� ���� �Ǵ����� Ȯ�����ִ� �Լ�
		
		for (int i = 0 ; i < 9; i++) {
			if (arr[row][i] == value) { // ���� üũ
				return false;
			}
		}
		
		for (int i = 0 ; i < 9; i++) {
			if (arr[i][col] == value) { // ���� üũ
				return false;
			}
		}
		
		int s_row = (row / 3) * 3; // 3x3�� ������
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
