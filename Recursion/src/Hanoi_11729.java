import java.util.Scanner;

public class Hanoi_11729 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //n���� ����
		
		int count = 1;
		for (int i = 0; i < n; i++) {
			count *= 2;
		} //System.out.println((int)Math.pow(2, n) - 1);
		System.out.println(count - 1);
		
		hanoi(n, 1, 3); 
		
	}
	
	public static void hanoi(int n, int start, int end) {
		/*
		 * 1. n-1 ���� a���� a�� b�� �ƴ� ���(6-a-b)���� �ű��
		 * 2. n��° ������ a���� b�� �ű��
		 * 3. n-1���� 6-a-b���� b�� �ű��
		 */
		
		if (n == 1) { //base condition (��� ���� 1)
			System.out.println(start + " " + end);
			return;
		}
		
		hanoi(n-1, start, 6 - start - end); //base condition���� ���� (��� ���� 2)
		System.out.println(start + " " + end);
		hanoi(n-1, 6 - start - end, end);
	}
}
