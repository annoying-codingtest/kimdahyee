import java.util.*;
public class 방번호_1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		
		String[] arr = n.split("");
		int[] input = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		
		int[] checked = new int[10];
		for (int i = 0; i < checked.length; i++) {
			checked[i] = 1; // 초기화
		}
		
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (checked[input[i]] != 0) {
				checked[input[i]]--;
			} else if (checked[input[i]] == 0) {
				if (input[i] == 6) {
					if (checked[9] != 0) {
						checked[9]--;
					} else {
						count++;
						for (int j = 0; j < checked.length; j++) {
							checked[j]++;
						}
						checked[6]--;
					}
				} else if (input[i] == 9) {
					if (checked[6] != 0) {
						checked[6]--;
					} else {
						count++;
						for (int j = 0; j < checked.length; j++) {
							checked[j]++;
						}
						checked[9]--;
					}
				} else {
					count++;
					for (int j = 0; j < checked.length; j++) {
						checked[j]++;
					}
					checked[input[i]]--;
				}
			}
		}
		
		System.out.println(count + 1);
		
	}

}
