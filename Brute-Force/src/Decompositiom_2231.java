import java.util.Scanner;

public class Decompositiom_2231 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int constructor = n; //������
			
		for (int i = 0; i < n; i++) { //0���� n���� ��� ���� �������� ����
			int num = i; //��Ƴ��� ��
			int sum = i; //������ 
				
			while (num != 0) {
				sum += num % 10;
				num /= 10; 
			}
			
			if (sum == n) {
				constructor = i;
				break;
			} else {
				constructor = 0; //���� ��������
			}
		}
		System.out.println(constructor);
	}
}
