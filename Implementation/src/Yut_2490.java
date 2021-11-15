import java.util.*;
public class Yut_2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ABCDE 도개걸윷모 순서 | 배 (0) 등 (1)
		
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int[][] input = new int[3][4];
		
		for (int i = 0; i < 3; i++) {
			int count = 0;
			for (int j = 0; j < 4; j++) {
				input[i][j] = s.nextInt();
				
				if (input[i][j] == 0) {
					count++;
				}
			}
			
			switch (count) {
				case 0: sb.append("E").append("\n"); break;
				case 1: sb.append("A").append("\n"); break;
				case 2: sb.append("B").append("\n"); break;
				case 3: sb.append("C").append("\n"); break;
				case 4: sb.append("D").append("\n"); break;
			}
		}
		System.out.println(sb);
	}

}
