import java.util.*;
public class 쉽게푸는문제_1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int start = s.nextInt();
		int end = s.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int index = 1, count = 1, sum = 0;
		while (index != end + 1) {
			for (int i = 0; i < count; i++) {
				map.put(index++, count);
				if (index == end + 1) break;
			}
			count++;
		}
		
		for (int i = start; i <= end; i++) {
			sum += map.get(i);
		}
		
		System.out.println(sum);
	}

}
