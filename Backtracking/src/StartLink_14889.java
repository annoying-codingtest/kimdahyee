import java.io.*;
import java.util.*;
public class StartLink_14889 {
	
	static int n, min = Integer.MAX_VALUE; 
	static int[][] ablity;
	static boolean[] checked;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		ablity = new int[n][n];
		checked = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				ablity[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		func(0, 0);
		
		System.out.println(min);
		
	}
	
	public static void func(int idx, int k) {
		if (k == (n / 2)) {
			calculateAblity();
			return;
		}
		
		for (int i = idx; i < n; i++) {
			if (!checked[i]) {
				checked[i] = true;
				func(i + 1, k + 1);
				checked[i] = false;
			}
		}
	}
	
	public static void calculateAblity() { 
		int start = 0, link = 0;
		
		for (int i = 0; i < n -1; i++) {
			for(int j = i; j < n; j++) {
				if (checked[i] && checked[j]) {
					start += ablity[i][j];
					start += ablity[j][i];
				} else if (!checked[i] && !checked[j]) {
					link += ablity[i][j];
					link += ablity[j][i];
				}
			}
		}
		
		int diff = Math.abs(start - link);
		
		if (diff == 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		min = Math.min(min, diff);
	}

}
