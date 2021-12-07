import java.util.*;
public class 직사각형에서탈출_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int w = s.nextInt();
		int h = s.nextInt();
		
		int min = Integer.MAX_VALUE;
		
		min = Math.min(min, x);
		min = Math.min(min, y);
		min = Math.min(min, w - x);
		min = Math.min(min, h - y);
		
		System.out.println(min);
	}

}
