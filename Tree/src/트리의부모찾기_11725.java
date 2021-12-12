import java.util.*;
public class 트리의부모찾기_11725 {

	public static int n;
	public static int[] parent; 
	public static ArrayList<Integer>[] arr;
	public static boolean[] checked;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		parent = new int[n + 1];
		checked = new boolean[n + 1];
		
		arr = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < n - 1; i ++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			arr[x].add(y);
			arr[y].add(x);
		}
		
		dfs(1);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= n; i++) {
			sb.append(parent[i]).append("\n");
		}
		
		System.out.print(sb);
		
	}
	
	public static void dfs(int k) {
		checked[k] = true;
		for (int i : arr[k]) { // 현재 노드와 연결되어 있는 노드들
			if (!checked[i]) { // 연결되어 있는 노드 중 방문 기록이 없으면
				parent[i] = k; // 그게 부모 노드
				dfs(i); // 나머지 자식 노드 탐색
			}
		}
	}

}
