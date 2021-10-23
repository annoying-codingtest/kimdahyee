import java.util.*;
public class PrinterQueue_1966 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int test = s.nextInt(); // 테스트 케이스의 수

		for (int k = 0; k < test; k++) {
			int n = s.nextInt(); // 문서의 개수
			int index = s.nextInt(); // 몇 번째로 인쇄되는지 궁금한 문서 idx
			
			LinkedList<int[]> q = new LinkedList<int[]>();
			
			for (int i = 0; i < n; i++) {
				int input = s.nextInt();
				q.offer(new int[] {i, input});
			}
			
			int count = 0;
			while (!q.isEmpty()) {
				
				int[] front = q.poll();
				boolean max = true; // 처음 뽑은 원소가 가장 큰지 아닌지를 판단
				
				for (int i = 0; i < q.size(); i++) {
					if (front[1] < q.get(i)[1]) {
						q.offer(front); // 처음 뽑은 원소와
						for (int j = 0; j < i; j++) { 
							// 중요도가 높은 원소 이전의 원소들을 뒤로 보내
							q.offer(q.poll());
						}
						max = false;
						break;
					}
				}
				
				if (!max) { continue; } // 다음 탐색
				count++; // front 원소가 가장 큰 원소였으면 출력횟수++
				
				if (front[0] == index) { break; }
			}	
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
