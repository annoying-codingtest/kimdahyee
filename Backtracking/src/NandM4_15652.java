import java.util.Scanner;
public class NandM4_15652 {

	static int n, m;
	static int[] arr; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		
		arr = new int[m];
		
		func(0, 0);
	}
	
	public static void func(int k, int j) { 
		if (k == m) { 
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = j; i < n; i++) {
			arr[k] = i + 1;
			func(k + 1, j);
			j++;
		}
	}

}
