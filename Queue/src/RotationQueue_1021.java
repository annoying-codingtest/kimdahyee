import java.util.*;
public class RotationQueue_1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> q = new LinkedList<>();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // queue의 크기
		int m = s.nextInt(); // 뽑아내려고 하는 수의 개수
		
		for (int i = 0; i < n; i++) {
			q.offer(i + 1);
		}
		
		int[] indexs = new int[m];
		for (int i = 0; i < m; i++) {
			indexs[i] = s.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < m; i++) {
			int target = q.indexOf(indexs[i]);
			// 뽑으려는 원소의 덱에서의 위치
			int half = 0; 
			// 시작과 끝 중 원소가 어디에 가까운지 알기 위해서
			
			if (q.size() % 2 == 0) {
				half = q.size() / 2 - 1;
			} else {
				half = q.size() / 2;
			}
			
			if (target <= half) {
				for (int j = 0; j < target; j++) {
					q.offerLast(q.pollFirst());
					count++;
				}
			} else {
				for (int j = 0; j < q.size() - target; j++) {
					// 뽑으려는 원소 포함해서 다 앞으로 보내
					q.offerFirst(q.pollLast());
					count++;
				}
			}
			q.pollFirst(); // 첫 번째 원소 뽑아내
		}
		System.out.println(count);
	}

}
