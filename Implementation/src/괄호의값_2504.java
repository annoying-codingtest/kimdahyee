import java.util.*;
public class 괄호의값_2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String input = s.next();
		String[] arr = input.split("");
		
		Stack<String> stack = new Stack<>();
		
		int tmp = 1, result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
				case "(":
					stack.push("(");
					tmp *= 2;
					break;
					
				case "[":
					stack.push("[");
					tmp *= 3;
					break;
					
				case ")":
					if (stack.isEmpty() || !stack.peek().equals("(")) {
						// 짝이 안맞아 -> 올바르지 않은 문자열
						System.out.println(0);
						System.exit(0);
					}
					
					if (arr[i - 1].contentEquals("(")) { 
						// 주의) 바로 직전 값과 짝이 맞을 경우 **
						result += tmp;
					}
						
					stack.pop(); // 닫는 괄호는 항상 pop 한다는 생각하기
					tmp /= 2; // 해당 세트 끝났으니까 복귀시켜
					break;
					
				case "]":
					if (stack.isEmpty() || !stack.peek().equals("[")) {
						// 올바르지 않은 문자열
						System.out.println(0);
						System.exit(0);
					}
					
					if (arr[i - 1].contentEquals("[")) { 
						// ** 핵심
						result += tmp;
					}
					
					stack.pop();
					tmp /= 3;
					break;
			}
		}
		
		System.out.println(!stack.isEmpty() ? 0 : result);
		
	}
	
	/*
	 * ]()
	 * 0
	 */

}
