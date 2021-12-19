import java.util.*;
import java.io.*;
public class 트리순회_1991 {

	public static int n;
	public static Map<String, Node> tree = new HashMap<>();
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 노드의 개수
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String b = st.nextToken();
			String l = st.nextToken();
			String r = st.nextToken();
			
			Node node = new Node(b, l, r);
			tree.put(node.body, node);
		}
		
		preorder("A");
		sb.append("\n");
		inorder("A");
		sb.append("\n");
		postorder("A");
		
		System.out.print(sb);
		
	}
	
	public static void preorder(String b) {
		if (tree.get(b) == null) {
			return;
		} else {
			sb.append(tree.get(b).body);
			preorder(tree.get(b).left);
			preorder(tree.get(b).right);
		}
	}
	
	public static void inorder(String b) {
		if (tree.get(b) == null) {
			return;
		} else {
			inorder(tree.get(b).left);
			sb.append(tree.get(b).body);
			inorder(tree.get(b).right);
		}
	}

	public static void postorder(String b) {
		if (tree.get(b) == null) {
			return;
		} else {
			postorder(tree.get(b).left);
			postorder(tree.get(b).right);
			sb.append(tree.get(b).body);
		}
	}

}

class Node {
	
	String body, left, right;
	
	public Node(String body, String left, String right) {
		this.body = body;
		this.left = left.equals(".") ? null : left;
		this.right = right.equals(".") ? null : right;
	}
}
