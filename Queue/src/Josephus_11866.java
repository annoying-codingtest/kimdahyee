import java.util.*;
public class Josephus_11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<>();
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			queue.offer(i + 1);
		}
		
		sb.append("<");
		while (queue.size() != 0) {
			for (int i = 0; i < k - 1; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll());
			
			if (queue.size() != 0) {
				sb.append(", ");
			} else {
				sb.append(">");
				System.out.print(sb);
				return;
			}
		}
	}
}
