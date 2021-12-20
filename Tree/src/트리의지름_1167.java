import java.util.*;
import java.io.*;
public class 트리의지름_1167 {

	public static int v, node, max = Integer.MIN_VALUE;
	public static ArrayList<Node>[] tree;
	public static boolean[] checked;
	
	/*
	 * 한 정점에서 가장 먼 정점으로 가는 경로와 가장 먼 정점 사이의 경로는 항상 일부가 겹친다
	 * 각 정점에서 최장 정점을 구하면 항상 가장 먼 정점 중 하나를 포함한다
	 * 
	 * 1. dfs를 통해 임의의 정점 하나에서 가장 먼 정점을 구한다.
	 * -> 각 정점에서 최장 거리인 정점이 가장 먼 정점 중 하나일테니까
	 * 2. dfs를 통해 구한 정점으로부터 가장 먼 정점까지의 거리를 구한다.
	 * -> 나머지 정점 하나를 찾아
	 */
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		v = Integer.parseInt(st.nextToken());
		
		tree = new ArrayList[v + 1];
		for (int i = 0; i <= v; i++) {
			tree[i] = new ArrayList<>();
		} // 초기화 필수
		
		for (int i = 0; i < v; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			while (true) {
				int b = Integer.parseInt(st.nextToken());
				if (b == -1) { break; }
				int dis = Integer.parseInt(st.nextToken());
				tree[a].add(new Node(b, dis));
			}
		}
		
		checked = new boolean[v + 1];
		dfs(1, 0); // 1
		
		checked = new boolean[v + 1]; // 초기화
		dfs(node, 0); // 2
		
		System.out.println(max);
		
	}
	
	public static void dfs(int k, int dis) {
		if (dis > max) {
			max = dis;
			node = k;
		}
		checked[k] = true;
		
		for (int i = 0; i < tree[k].size(); i++) {
			Node n = tree[k].get(i); // k 노드와 연결된 노드 하나씩 꺼내서
			if (!checked[n.b]) {
				dfs(n.b, n.dis + dis); 
				checked[n.b] = true;
			}
		}
	}
	
	public static class Node {
		int b, dis;
		
		public Node(int b, int dis) {
			this.b = b;
			this.dis = dis;
		}
	}
}


