import java.util.Scanner;
public class NandM3_15651 {

	static int n, m;
	static int[] arr; 
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		
		arr = new int[m];
		
		func(0);
		System.out.print(sb);
	}
	
	public static void func(int k) {
		if (k == m) { 
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			arr[k] = i + 1; 
			func(k + 1); 
		}
	}

}
