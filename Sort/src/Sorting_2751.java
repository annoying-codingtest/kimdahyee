import java.util.*;
public class Sorting_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(s.nextInt());
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int element : arr) {
			sb.append(element).append('\n');
		}
		System.out.println(sb);
	}

}
