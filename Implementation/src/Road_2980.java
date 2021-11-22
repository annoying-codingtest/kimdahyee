import java.io.*;
import java.util.*;
public class Road_2980 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int[][] light = new int[l + 1][2];
		// 각 거리 별로 소요시간 저장, [0] 빨간불 소요시간 [1] 초록불 소요시간
		
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			light[Integer.parseInt(input[0])][0] = Integer.parseInt(input[1]);
			light[Integer.parseInt(input[0])][1] = Integer.parseInt(input[2]);
		}
		
		int time = 0;
		for (int i = 1; i <= l; i++) {
			if (light[i][0] != 0) {
				int temp = time % (light[i][0] + light[i][1]);
				if (temp >= 0 && temp <= light[i][0]) {
					time += (light[i][0] - temp);
				}
			}
			time++;
		}
		System.out.println(time - 1);
	}

}
