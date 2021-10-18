import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>(); // 후입선출, 위로 들어오고 위에서 나가고
		Queue<Integer> queue = new LinkedList<>(); // 선입선출. 위로 들어오고 아래에서 나가고
		Deque<Integer> deque = new LinkedList<>(); // 양쪽
		
		stack.push(1); // 제일 상단의 원소 추가
		stack.pop(); // 제일 상단의 원소 제거
		stack.peek(); // 제일 상단의 원소 확인
		stack.clear(); // 스택 초기화
		stack.empty(); // 스택이 비었는지 아닌지 여부 반환
		stack.size(); // 스택의 크기 반환
		
		queue.offer(1); // 제일 하단(tail)에 원소 추가
		queue.poll(); // 제일 상단의 원소 반환 후 제거, 비어있다면 null 반환
		queue.peek(); // 제일 상단(head)의 원소 확인
		queue.clear(); // 큐 초기화
		queue.isEmpty(); // 큐가 비었는지 아닌지 여부 반환
		queue.size(); //큐의 크기 반환
		
		
		deque.offerFirst(1); // 제일 상단에 원소 추가
		deque.offerLast(1); // 제일 하단에 원소 추가
		deque.pollFirst(); // 제일 상단의 원소 반환 후 제거, 비어있다면 null 반환
		deque.pollLast(); // 제일 하단의 원소 반환 후 제거, 비어있다면 null 반환
		deque.peekFirst(); // 제일 상단의 원소 확인
		deque.peekLast(); // 제일 하단의 원소 확인
		deque.clear(); // 덱 초기화
		deque.isEmpty(); // 덱이 비었는지 아닌지 여부 반환
		deque.size(); //덱의 크기 반환
		
	}

}
