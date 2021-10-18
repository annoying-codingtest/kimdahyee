import java.io.*;
import java.util.*;
public class InsertOperator_14888 {

	static int n;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[] numbers;
	static int[] operator = new int[4];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		numbers = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st2.nextToken());
		}
		
		func(numbers[0], 1);
		
		System.out.print(max + "\n" + min);
	}
	
	public static void func(int number, int k) { 
		if (k == n) { // n-1개의 연산자를 다 뽑았으면
			max = Math.max(max, number);
			min = Math.min(min, number);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if (operator[i] != 0) {
				
				operator[i]--;
				
				switch(i) {
				case 0: func(number + numbers[k], k + 1); break;
				case 1: func(number - numbers[k], k + 1); break;
				case 2: func(number * numbers[k], k + 1); break;
				case 3: func(number / numbers[k], k + 1); break;
				}
				
				operator[i]++;
			}
		}
	}

}
