import java.util.Scanner;

public class Decompositiom_2231 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int constructor = n; //생성자
			
		for (int i = 0; i < n; i++) { //0부터 n까지 모든 수의 분해합을 구해
			int num = i; //깎아내릴 값
			int sum = i; //분해합 
				
			while (num != 0) {
				sum += num % 10;
				num /= 10; 
			}
			
			if (sum == n) {
				constructor = i;
				break;
			} else {
				constructor = 0; //조건 잊지말기
			}
		}
		System.out.println(constructor);
	}
}
