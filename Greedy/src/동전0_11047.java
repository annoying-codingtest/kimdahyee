import java.util.*;
import java.io.*;
public class 동전0_11047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Scanner로 입력 받으면 런타임에러 발생
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			// 최소한의 개수를 이용 -> 가장 큰 가치를 지닌 동전부터 선택
			if (a[i] <= k) {
				count += (k / a[i]);
				// 현재 가치의 동전으로 구성할 수 있는 개수를 더해
				k = k % a[i];
			}
		}
		
		System.out.println(count);
		
	}

}
