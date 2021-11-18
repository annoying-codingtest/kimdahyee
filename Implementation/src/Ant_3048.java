import java.io.*;
import java.util.*;
public class Ant_3048 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuffer stringBuffer = new StringBuffer(s1);
		s1 = stringBuffer.reverse().toString();
		
		String concat = s1.concat(s2); // CBADEF
		String[] current =  concat.split("");
		
		if (t == 0) {
			System.out.println(concat);
            return;
		} else {
			for (int i = 1; i <= t; i++) {
				int start = n1 - i;
				int end = n1 + (i - 1);
				
				if (start < 0 || end < 0) {
					break;
				}
				
				for (int j = start; j < end; j += 2) {
					String tmp = current[j];
					current[j] = current[j + 1];
					current[j + 1] = tmp;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < current.length; i++) {
			sb.append(current[i]);
		}
		System.out.println(sb);
	}

}
