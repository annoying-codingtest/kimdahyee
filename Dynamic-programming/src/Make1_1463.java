import java.util.Scanner;
public class Make1_1463 {

	static int n, count;
	static int[] d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		d = new int[n + 1];
		
		func();
		
		System.out.println(count);
	}
	
	public static void func() {
		d[1] = 0;
		for (int i = 2; i <= n; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0) {
				d[i] = Math.min(d[i / 2] + 1, d[i]);
			}
			if (i % 3 == 0) {
				d[i] = Math.min(d[i / 3] + 1, d[i]);
			}
		}
		count = d[n];
	}

}
