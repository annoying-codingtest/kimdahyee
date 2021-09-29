import java.io.*;
import java.util.*;
public class CompCoor_18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] input =  br.readLine().split(" ");
		
		int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
		int[] sortNumbers = numbers.clone();
		
		Arrays.sort(sortNumbers); 
		
		Map<Integer, Integer> hm = new HashMap<>(); 
		int index = 0;
		for (int num : sortNumbers) {
			if (!hm.containsKey(num)) {
				hm.put(num, index++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numbers.length; i++) {
			sb.append(hm.get(numbers[i])).append(" ");
		}
		System.out.println(sb);
	}

}
