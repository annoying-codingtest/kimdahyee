import java.util.*;
public class 알람시계_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int m = s.nextInt();
		
		int hour = h, minute = m - 45;
		
		if (minute < 0) {
			minute += 60;
			if (h == 0) {
				hour = 23;
			} else {
				hour = h - 1;
			}
		}
		
		System.out.println(hour + " " + minute);
	}

}
