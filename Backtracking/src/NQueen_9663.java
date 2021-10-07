import java.util.*;
public class NQueen_9663 {
	
	static boolean[] checked1; // 열 기준
	static boolean[] checked2; // 죄측하단 우측상단 기준
	static boolean[] checked3; // 좌측상단 우측하단 기준
	static int count, n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		checked1 = new boolean[n];
		checked2 = new boolean[n * n - 1]; 
		checked3 = new boolean[n * n - 1]; 
		count = 0;
		
		if (n == 1 ) {
			System.out.println(1);
		} else {
			func(0);
			System.out.println(count);
		}
	}
	
	public static void func(int current) {
		if (current == n) { // 모든 행에 퀸이 다 놓여졌으면
			count++;
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (checked1[i] || checked2[current + i] || checked3[current - i + n - 1]) {
				// 이미 방문한 이력이 있는 곳이라면 다음을 탐색
				continue;				
			}
			
			checked1[i] = true;
			checked2[current + i] = true;
			checked3[current - i + n - 1] = true;
			
			func(current + 1); // 다음 행 탐색 호출
			
			checked1[i] = false;
			checked2[current + i] = false;
			checked3[current - i + n - 1] = false;
		}
	}

}
