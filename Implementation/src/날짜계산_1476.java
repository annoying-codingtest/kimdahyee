import java.util.*;
public class 날짜계산_1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int e = scanner.nextInt();
		int s = scanner.nextInt();
		int m = scanner.nextInt();
		
		int size = 15 * 28 * 19;
		
		for (int i = 1; i <= size; i++) {
			if ((i - e) % 15 == 0 && (i - s) % 28 == 0 && (i - m) % 19 == 0) {
				System.out.println(i);
				return;
			}
		}
		
	}

}
