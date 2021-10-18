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
			// StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = s.nextInt(); // Integer.parseInt(st.nextToken());
			arr[i][1] = s.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[1] == e2[1]) { // y값이 같으면
				return e1[0] - e2[0]; // x값을 비교, 선행이 크면 양수가 받환 후행이 크면 음수가 반환
				//자바는 오름차순이 디폴트라 음수가 나오면 선행이 후행 보다는 작다는 뜻이므로 위치 안바꾸고 양수면 바꿔
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
