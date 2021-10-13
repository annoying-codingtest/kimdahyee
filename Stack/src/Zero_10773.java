import java.util.*;
public class Zero_10773 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		
		int[] data = new int[k];
		int pos = 0;
		
		int[] input = new int[k];
		for (int i = 0; i < k; i++) {
			input[i] = s.nextInt();
			
			if (input[i] != 0) {
				data[pos++] = input[i];
			} else { 
				data[--pos] = 0;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		System.out.println(sum);
	}
}
