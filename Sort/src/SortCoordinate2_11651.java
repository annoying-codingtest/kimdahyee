import java.util.Arrays;
import java.util.Scanner;
public class SortCoordinate2_11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = s.nextInt();
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});
		
		for (int i = 0; i < n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		System.out.println(sb);
		
	}

}
