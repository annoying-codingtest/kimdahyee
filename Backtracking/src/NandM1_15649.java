import java.util.*;
public class NandM1_15649 {

	static int n, m;
	static int[] arr; // 수열을 담을 배열
	static boolean[] checked; // 1부터 n까지 수의 방문 여부를 담을 배열
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		
		arr = new int[m];
		checked = new boolean[n];
		
		func(0);
	}
	
	public static void func(int k) {
		if (k == m) { // 다 뽑았으면
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!checked[i]) { 
				arr[k] = i + 1; 
				checked[i] = true; 
				func(k + 1);
				checked[i] = false;
			}
		}
	}

}
