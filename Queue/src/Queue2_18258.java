import java.io.*;
import java.util.*;
public class Queue2_18258 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> queue = new LinkedList<>(); // double-ended queue: 덱
		int n = Integer.parseInt(br.readLine());
		
		while (n -- > 0) { // n번 반복
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {	
				case "push":
					queue.offer(Integer.parseInt(st.nextToken()));	
					break;
					
				case "pop" :
					Integer value = queue.poll();	
					if(value == null) { // 덱에 들어있는 정수가 없으면
						sb.append(-1).append('\n');
					}
					else {
						sb.append(value).append('\n');
					}
					break;
					
				case "size":	
					sb.append(queue.size()).append('\n');
					break;
					
				case "empty":
					if(queue.isEmpty()) { // 비어있으면 1
						sb.append(1).append('\n');
					}
					else {
						sb.append(0).append('\n');
					}
					break;
					
				case "front":
					Integer value2 = queue.peek();
					if(value2 == null) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(value2).append('\n');
					}
					break;
					
				case "back":
					Integer value3 = queue.peekLast();	 
					if(value3 == null) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(value3).append('\n');
					}
					break;
					
			}
		}
		
		System.out.println(sb);
		
	}
}
