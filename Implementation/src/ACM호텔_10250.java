import java.util.*;
public class ACM호텔_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int h = s.nextInt();
			int w = s.nextInt();
			int n = s.nextInt();
			
			int x = n % h;
			int y = n / h;
			
			if (x == 0) {
				x = h;
			} else {
				y += 1; // 핵심
			}
			sb.append(x * 100 + y).append("\n");
		}
		System.out.println(sb);
	}

}
