import java.util.*;
public class 수들의합_1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		// input type 주의하기
		long input = s.nextLong();
		long sum = 0;
		int count = 0;
		
		for (int i = 1; i <= input; i++) {
			if (sum > input) { break; }
			sum += i;
			count++;
		}
		
		System.out.println(count - 1);
		
	}

}
