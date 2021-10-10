import java.util.*;
public class Fibonacci_1003 {

	static int t; // 테스트 케이스의 개수
	static int max = Integer.MIN_VALUE;
	static int[] zero, one;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		t = s.nextInt(); 
		
		int[] testCase = new int[t];
		for(int i = 0; i < t; i++) {
			testCase[i] = s.nextInt();
			max = Math.max(max, testCase[i]);
		}
		
		zero = new int[max + 1];
		one = new int[max + 1];
		
		func();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			sb.append(zero[testCase[i]]).append(" ");
			sb.append(one[testCase[i]]).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void  func() {
		zero[0] = 1;
		zero[1] = 0;
		one[0] = 0;
		one[1] = 1;
		
		for (int i = 2; i <= max; i++) {
			zero[i] = zero[i -1] + zero[i - 2];
			one[i] = one[i -1] + one[i - 2];
		}
	}

}
