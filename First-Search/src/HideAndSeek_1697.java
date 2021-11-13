import java.util.*;
public class HideAndSeek_1697 {

	static int n, k, current, count = 0;
	static int[] time = new int[100001];
	static boolean[] checked = new boolean[100001];
	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		k = s.nextInt();
		
		if (n == k) {
			System.out.println(0);
		} else {
			bfs();
		}
		
	}

	public static void bfs() {
		current = n;
		q.offer(n);
		checked[current] = true;
		time[current] = 0;
		
		while(!q.isEmpty()) {
			int item = q.poll();
			int[] change = {item * 2, item + 1, item - 1};
			
			for (int i = 0; i < 3; i++) {
				current = change[i];	
				
				// current < checked.length 없을 경우 런타임에러 발생
				if (current >= 0 && current < checked.length && !checked[current]) {
					q.offer(current);
					time[current] = time[item] + 1;
					checked[current] = true;
				}
				
				if (current == k) {
					System.out.print(time[item] + 1);
					System.exit(0);
				}
			}
		}
	}
}
