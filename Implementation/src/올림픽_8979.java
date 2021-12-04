import java.util.*;
import java.io.*;
public class 올림픽_8979 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] c = new int[n][4];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			c[i][0] = Integer.parseInt(st.nextToken());
			c[i][1] = Integer.parseInt(st.nextToken()); // 금
			c[i][2] = Integer.parseInt(st.nextToken()); // 은
			c[i][3] = Integer.parseInt(st.nextToken()); // 동
		}
		
		Arrays.sort(c, (e1, e2) -> {
			if(e1[1] == e2[1]) { // 금메달의 수가 같으면
				if (e1[2] == e2[2]) { // 은메달의 수가 같으면
					return e1[3] - e2[3];
				} else {
					return e1[2] - e2[2]; // 은메달 개수에 따라 정렬
				}
			} else {
				return e1[1] - e2[1];
			}
		});
		
		int count = 1;
		for (int i = n - 1; i >= 0; i--) {
			if (c[i][0] == k) {
				System.out.print(count);
				return;
			} else {
				count++;
			}
		}
	}

}
