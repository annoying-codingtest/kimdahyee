import java.util.Scanner;

public class Hanoi_11729 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //n개의 원판
		
		int count = 1;
		for (int i = 0; i < n; i++) {
			count *= 2;
		} //System.out.println((int)Math.pow(2, n) - 1);
		System.out.println(count - 1);
		
		hanoi(n, 1, 3); 
		
	}
	
	public static void hanoi(int n, int start, int end) {
		/*
		 * 1. n-1 개를 a에서 a도 b도 아닌 기둥(6-a-b)으로 옮긴다
		 * 2. n번째 원판을 a에서 b로 옮긴다
		 * 3. n-1개를 6-a-b에서 b로 옮긴다
		 */
		
		if (n == 1) { //base condition (재귀 조건 1)
			System.out.println(start + " " + end);
			return;
		}
		
		hanoi(n-1, start, 6 - start - end); //base condition으로 수렴 (재귀 조건 2)
		System.out.println(start + " " + end);
		hanoi(n-1, 6 - start - end, end);
	}
}
