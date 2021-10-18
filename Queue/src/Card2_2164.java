import java.util.*;
public class Card2_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		// 선입선출, 제일 위 = 상단 / 제일 아래 = 하단
		
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			queue.offer(i + 1);
		}
		
		if (queue.size() == 1) {
			System.out.println(1);
			System.exit(0);
		}
		
		while (1 < queue.size()) {
			queue.poll(); // 제일 위에 있는 카드를 버려
			queue.offer(queue.poll());
			
			if (queue.size() == 1) {
				System.out.println(queue.peek());
				return;
			}
		}
		
	}

}
