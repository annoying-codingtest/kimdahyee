import java.util.Scanner;

public class Blackjack_2798 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = s.nextInt();
		}
		
		int sum = 0, max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum = numbers[i] + numbers[j];
				for (int k = j + 1; k < n; k++) {
					sum += numbers[k];
					max = calMax(sum, max, m);
					sum -= numbers[k];
				}
				sum = 0;
			}
		}
		
		System.out.println(max);
		
	}
	
	public static int calMax(int sum, int max, int m) {
		if (sum > max && sum <= m) {
			return sum;
		} else {
			return max;
		}
	}
}
