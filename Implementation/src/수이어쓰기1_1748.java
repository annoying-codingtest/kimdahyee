import java.util.*;
public class 수이어쓰기1_1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int e = 0, tmp = n;
		while (tmp > 0) {
			tmp /= 10;
			e++;
		}
		
		int base = 9;
		int count = 0, result = 0; 
		// count는 문자의 개수를 저장하는 변수, result는 자릿수를 저장하는 변수
		
		if (e == 1) {
			System.out.print(n);
			return;
		} else {
			for (int i = 1; i < e; i++) {
				result += base * i;
				count += base;
				base *= 10;
			}
		}

		result += (e * (n - count));
		System.out.print(result);
	}

}
