import java.util.*;
import java.io.*;
public class Deque_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> dequeue = new LinkedList<>();
	
		int n = Integer.parseInt(br.readLine());
		
		while (n --> 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
				case "push_front":
					dequeue.offerFirst(Integer.parseInt(st.nextToken()));
					break;
					
				case "push_back":
					dequeue.offerLast(Integer.parseInt(st.nextToken()));
					break;
					
				case "pop_front":
					Integer value = dequeue.pollFirst();
					if (value == null) {
						sb.append(-1).append("\n");
					} else {
						sb.append(value).append("\n");
					}
					break;
					
				case "pop_back":
					Integer value2 = dequeue.pollLast();
					if (value2 == null) {
						sb.append(-1).append("\n");
					} else {
						sb.append(value2).append("\n");
					}
					break;
					
				case "size":
					sb.append(dequeue.size()).append("\n");
					break;
					
				case "empty":
					if (dequeue.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
					
				case "front":
					Integer value3 = dequeue.peekFirst();
					if (value3 == null) {
						sb.append(-1).append("\n");
					} else {
						sb.append(value3).append("\n");
					}
					break;
					
				case "back":
					Integer value4 = dequeue.peekLast();
					if (value4 == null) {
						sb.append(-1).append("\n");
					} else {
						sb.append(value4).append("\n");
					}
					break;	
					
			}
					
		}
		
		System.out.print(sb);
		
	}
}
