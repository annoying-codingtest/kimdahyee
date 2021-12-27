import java.util.*;
public class 수들의합_1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();
		
		boolean[] checked = new boolean[input + 1];
		
		int count = 0, sub = input;
		
		for (int i = 1; i <= input; i++) {
			if (!checked[i]) {
				count++;
				sub -= i;
				checked[i] = true;
			}

			if (checked[sub] || sub == 0) {
				System.out.println(count);
				return;
			}
		}
	}

}
