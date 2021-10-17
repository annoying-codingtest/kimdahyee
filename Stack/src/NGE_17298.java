import java.util.*;
import java.io.*;
public class NGE_17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] input = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			while (!stack.empty() && input[stack.peek()] < input[i]) { 
				// top() ������ ������ ���Һ��� ū ���� ������ ������ 
				input[stack.pop()] = input[i];
			}
			stack.push(i);
		}
		
		while (!stack.empty()) {
			input[stack.pop()] = -1;
		}
		
		for (int i = 0; i < input.length; i++) {
			sb.append(input[i] + " ");
		}
		System.out.print(sb);
	}

}
