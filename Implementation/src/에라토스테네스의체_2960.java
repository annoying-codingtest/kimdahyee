import java.util.*;
public class 에라토스테네스의체_2960 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			num.add(i + 2);
		}
		
		int count = 0;
		int p = num.get(0);
		
		while (count != k) {
			for (int i = 0; i < num.size(); i++) {
				if (num.get(i) % p == 0) {
					
					if (count == k - 1) {
						System.out.println(num.get(i));
						return;
					}
					
					num.remove(i);
					count++;
				}
			}
			p = num.get(0);
		}
	}

}
