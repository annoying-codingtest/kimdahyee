import java.util.*;
import java.io.*;
public class 올림픽v2_8979 {

	public static int[][] c;
	public static int n, k;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		c = new int[n + 1][3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken());
			c[idx][0] = Integer.parseInt(st.nextToken()); // 금
			c[idx][1] = Integer.parseInt(st.nextToken()); // 은
			c[idx][2] = Integer.parseInt(st.nextToken()); // 동
		}
		
		System.out.println(func());

	}
	
	public static int func() {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i == k) {
				continue;
			} else {
				if (c[k][0] < c[i][0]) { // 알고자하는 국가보다 금메달의 수가 더 많으면
					count++;
					continue;
				} else if (c[k][0] == c[i][0]) {
					if (c[k][1] < c[i][1]) { // 은메달의 수가 더 많으면
						count++;
						continue;
					} else if (c[k][1] == c[i][1]) {
						if (c[k][2] < c[i][2]) {
							count++;
						}
					}
				}
			}
		}
		return count + 1;		
	}

}
