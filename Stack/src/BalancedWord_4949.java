import java.util.*;
import java.io.*;
public class BalancedWord_4949 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<String> inputArray = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		
		while (true) {
			String input = br.readLine();
			inputArray.add(input);
			
			if (input.equals(".")) {
				break;
			}
		}
		
		for (int i = 0; i < inputArray.size() - 1; i++) {
			String[] splitArray = inputArray.get(i).split("");
			
			for (int j = 0; j < splitArray.length; j++) {				
				if (splitArray[j].equals("(") || splitArray[j].equals("[") || splitArray[j].equals(")") || splitArray[j].equals("]")) {
					if (stack.empty()) {
						stack.push(splitArray[j]);
					} else {
						if (stack.peek().equals("(") && splitArray[j].equals(")")) {
							stack.pop();
						} else if (stack.peek().equals("[") && splitArray[j].equals("]")) {
							stack.pop();
						} else {
							stack.push(splitArray[j]);
						}
					}
				} 
			}
			
			if (stack.empty()) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
			stack.clear();
		}
		
		System.out.println(sb);
		
	}
}