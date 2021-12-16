import java.util.*;
import java.io.*;
public class 집합_11723 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		
		Set<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
				case "add": 
					set.add(Integer.parseInt(st.nextToken()));
					break;
				case "remove":
					set.remove(Integer.parseInt(st.nextToken()));
					break;
				case "check":
					if (set.contains(Integer.parseInt(st.nextToken()))) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
				case "toggle":
					int input = Integer.parseInt(st.nextToken());
					if (set.contains(input)) {
						set.remove(input);
					} else {
						set.add(input);
					}
					break;
				case "all":
					set.clear();
					for (int j = 1; j <= 20; j++) {
						set.add(j);
					}
					break;
				case "empty":
					set.clear();
					break;
			}
			
		}
		
		System.out.println(sb);
		
	}

}
