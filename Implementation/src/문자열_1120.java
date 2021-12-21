import java.util.*;
public class 문자열_1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		String b = s.next();
		
		int min = a.length();
		for (int i = 0; i < b.length() - a.length() + 1; i++) {
			int count = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) != b.charAt(j + i)) {
					count++;
				}
			}
			min = Math.min(min, count);
		}
		
		System.out.println(min);
		
	}

}
