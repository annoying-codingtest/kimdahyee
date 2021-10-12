import java.io.*;
public class Stack_10828 {
	
	static int[] data;
	static int pos = 0;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		data = new int[n];
		
		String[] order = new String[n];
		for (int i = 0; i < n; i++) {
			order[i] = br.readLine();
		}
		
		for (int i = 0; i < n; i++) {
			if (order[i].contains("push")) {
				String[] arr = order[i].split(" ");
				push(Integer.parseInt(arr[1]));
			} else if (order[i].equals("pop")) {
				if (pos == 0) { //스택이 비어있으면
					sb.append(-1).append("\n");
				} else {
					sb.append(top()).append("\n");
					pop();
				}
			} else if (order[i].equals("size")) {
				sb.append(pos).append("\n");
			} else if (order[i].equals("empty")) {
				if (pos == 0) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else { // top
				if (pos == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(top()).append("\n");
				}
			}
		}
		
		System.out.println(sb);
		
	}

	public static void push(int value) {
		data[pos++] = value;
	}
	
	public static void pop() {
		pos--;
	}
	
	public static int top() {
		return data[pos - 1];
	}
}
