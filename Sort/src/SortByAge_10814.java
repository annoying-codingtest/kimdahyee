import java.util.*;
public class SortByAge_10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[][] age = new int[n][2];
		String[][] name = new String[n][2];
		for (int i = 0; i < n; i++) {
			age[i][0] = i;
			name[i][0] = String.valueOf(i); 
			age[i][1] = s.nextInt();
			name[i][1] = s.nextLine();			
		}
		
		Arrays.sort(age, (e1, e2) -> {
			if (e1[1] == e2[1]) { 
				return e1[0] - e2[0]; 
			} else {
				return e1[1] - e2[1];
			}
		});
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int index = age[i][0];
			sb.append(age[i][1]).append(name[index][1]).append("\n");
		}
		System.out.println(sb);
	}

}
