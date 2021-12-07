import java.util.*;
import java.io.*;
public class 경사로_14890 {

	public static int[][] height;
	public static int n, l;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* 
		 * 현재 계단의 높이와 다음 계단의 높이차를 확인
		 * 높이 차가 1이상인 경우 바로 return false 하고 다음 부분 탐색
		 * 높이 차가 1인 경우 -1인지 +1인지 확인해서 다르게 구현
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		// 경사로를 놓을 낮은 칸의 높이는 모두 같아야 하고, l개의 칸이 연속되어 있어야 한다.
		
		height = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				height[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int count = 0;
        for (int i = 0; i < n; i++) {
            if(calRow(i)) count++; //
            if(calCol(i)) count++; // 
        }
        System.out.println(count);
        
	}
	
	public static boolean calRow(int row) {
		boolean[] checked = new boolean[n]; 
		// 경사면 설치 여부 담는 배열
		
		for (int i = 0; i < n - 1; i++) { // 행 고정 열 순차 탐색
			int d = height[row][i] - height[row][i + 1];
			// 현재 계단과 다음 계단의 높이 차
			
			if (d > 1 || d < -1) { 
				return false; 
			} else if (d == -1) { 
				// 다음 계단이 현재 계단보다 높을 경우, 이전 계단들의 높이 확인
				// 현재 인덱스 부분이 낮은 계단의 기준 높이
				for (int j = 0; j < l; j++) { 
					/* i - j < 0인 경우 낮은 계단이 l개 존재하지 않는다는 의미이므로 
					 * j = 0부터 탐색해서 기준이 되는 지점도 카운팅에 포함시켜야해
					 */
					if (i - j < 0 || checked[i - j]) { return false; }
					if (height[row][i] != height[row][i - j]) { return false; }
					checked[i - j] = true; 					
				}
			} else if (d == 1) {
				// 다음 계단이 현재 계단보다 낮은 경우, 이후 계단들의 높이 확인
				for (int j = 1; j <= l; j++) { 
					if (i + j >= n || checked[i + j]) { return false; }
					if (height[row][i] - 1 != height[row][i + j]) { return false; }
					checked[i + j] = true; 					
				}
			}
		}
		return true;
	}
	
	public static boolean calCol(int col) {
		boolean[] checked = new boolean[n]; 
		// 경사면 설치 여부 담는 배열
		
		for (int i = 0; i < n - 1; i++) { // 행 고정 열 순차 탐색
			int d = height[i][col] - height[i + 1][col];
			// 현재 계단과 다음 계단의 높이 차
			
			if (d > 1 || d < -1) { 
				return false; 
			} else if (d == -1) { 
				// 다음 계단이 현재 계단보다 높을 경우, 이전 계단들의 높이 확인
				for (int j = 0; j < l; j++) {
					if (i - j < 0 || checked[i - j]) { return false; }
					if (height[i][col] != height[i - j][col]) { return false; }
					checked[i - j] = true; 					
				}
			} else if (d == 1) {
				// 다음 계단이 현재 계단보다 낮은 경우, 이후 계단들의 높이 확인
				for (int j = 1; j <= l; j++) { 
					if (i + j >= n || checked[i + j]) { return false; }
					if (height[i][col] - 1 != height[i + j][col]) { return false; }
					checked[i + j] = true; 					
				}
			}
		}
		return true;
	}

}
