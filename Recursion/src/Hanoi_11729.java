import java.io.*;

public class Hanoi_11729 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int)(Math.pow(2, n) - 1)).append('\n');
		
		hanoi(n, 1, 3); 
		
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int start, int end) {
		/*
		 * 1. n-1 ���� a���� a�� b�� �ƴ� ���(6-a-b)���� �ű��
		 * 2. n��° ������ a���� b�� �ű��
		 * 3. n-1���� 6-a-b���� b�� �ű��
		 */
		
		if (n == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		
		hanoi(n-1, start, 6 - start - end); 
		sb.append(start + " " + end + "\n");
		hanoi(n-1, 6 - start - end, end);
	}
}
