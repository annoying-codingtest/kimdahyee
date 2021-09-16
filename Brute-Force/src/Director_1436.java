import java.util.Scanner;

public class Director_1436 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int num = 666, count = 0;
		while (count != n) {
			if (String.valueOf(num).contains("666")) {
				count++;
			}
			if (count == n) {
				System.out.println(num);
				break;
			}
			num++;
		}
	}
}
