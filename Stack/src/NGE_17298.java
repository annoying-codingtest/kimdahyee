import java.util.*;
import java.io.*;
public class NGE_17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int input[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean find = false;
		for (int i = 0; i < input.length - 1; i++) { // i == 2
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] < input[j] && !find) {
					find = true;
					sb.append(input[j]).append(" ");
				}
			}
			
			if (!find) {
				sb.append("-1").append(" ");
			}
			find = false;
		}
		sb.append("-1");
		System.out.println(sb);
	}

}
