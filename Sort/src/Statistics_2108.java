import java.util.*;
public class Statistics_2108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(Math.round(mean(arr))).append("\n"); // 산술평균
		sb.append(arr[arr.length / 2]).append("\n"); // 중앙값
		sb.append(mode(arr)).append("\n"); //최빈값
		sb.append(arr[arr.length - 1] - arr[0]).append("\n"); //범위
		
		System.out.println(sb);
	}
	
	public static double mean(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum / arr.length;
	}
	
	public static int mode(int[] arr) {
		int[] count = new int[8001];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count[Math.abs(arr[i]) + 4000]++;
			} else {
				count[arr[i]]++;
			}
		}
		
		int max_index = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[max_index] < count[i]) {
				max_index = i;
			}
		}	

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < count.length; i++) {
			int x = i;
			if (count[i] == count[max_index]) {
				if (4000 < i) {
					list.add((x - 4000) * -1);
				} else {
					list.add(i);
				}
			}
		}
		
		Collections.sort(list);

		if (list.size() > 1) {
			return list.get(1);
		} else {
			return list.get(0);
		}
	
	}

}
