import java.util.Scanner;

public class Bulk_7568 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[][] xy = new int[n][3]; //[][0] x, [][1] y, [][2] k
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				xy[i][j] = s.nextInt();
			}
			xy[i][2] = 0;
		} //�ʱ� ������ �Է¹ޱ�
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) {
					xy[i][2]++; //������ ��ġ ū ��� �� ++
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print((xy[i][2] + 1) + " ");
		}
	}
}
