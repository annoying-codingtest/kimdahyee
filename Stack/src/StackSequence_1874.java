import java.util.*;
public class StackSequence_1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int start = 0;

		while (n --> 0) { // n--; n > 0;
			int input = s.nextInt(); 
			if (start < input) {
				for (int i = start + 1; i <= input; i++) { 
					// 오름차순 push을 위해 stack에 없으면 push
					stack.push(i);
					sb.append("+\n");
				}
				start = input;
			} 

			if (stack.peek() != input) {
				System.out.println("NO");
				System.exit(0);
			}
			
			stack.pop();
			sb.append("-\n");
		}
		
		System.out.println(sb);
		
	}

}
