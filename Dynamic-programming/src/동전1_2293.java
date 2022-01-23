import java.util.*;
public class 동전1_2293 {

	/*
	 * 다이나믹 프로그래밍 푸는 방법
	 * 1. 테이블 정의 dp[i] = j // i원을 만드는 경우의 수 j개
	 * 2. 점화식 찾기 k >= coin[i], dp[k] = dp[k] + dp[k - coin[i]]
	 * 3. 초기값 정하기 dp[0] = 1;
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		int[] value = new int[n];
		int[] dp = new int[k + 1];
		
		for (int i = 0; i < n; i++) {
			value[i] = s.nextInt();
		}
		
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= k; j++) {
				if (j >= value[i]) {
					dp[j] = dp[j] + dp[j - value[i]];
				}
			}
		}
		
		System.out.println(dp[k]);
		
	}

}
