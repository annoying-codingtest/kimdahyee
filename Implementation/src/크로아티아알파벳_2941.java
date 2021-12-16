import java.util.*;
public class 크로아티아알파벳_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String input = s.next();
		
		// a = a.replace(string, string)으로 해야 replace된 값이 저장
		input = input.replace("c=", "*")
				.replace("c-", "*")
				.replace("dz=", "*")
				.replace("d-", "*")
				.replace("lj", "*")
				.replace("nj", "*")
				.replace("s=", "*")
				.replace("z=", "*");
		
		System.out.println(input.length());
		
	}

}
