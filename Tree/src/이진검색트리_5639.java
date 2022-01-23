import java.util.*;
public class 이진검색트리_5639 {
	
	// 디버깅이 안돌아가는 이유 확인해보기
	static int[] tree = new int[10001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int idx = 0;
		while (s.hasNext()) {
			tree[idx++] = s.nextInt();
		}
		
		postOrder(0, idx - 1);
		// 시작이랑 끝을 넘겨
	}

	public static void postOrder(int n, int e) {
		if (n > e) {
			return;
		}
		
		int mid = n + 1;
		while (mid <= e && tree[mid] < tree[n]) {
			mid++;
		}
		
		postOrder(n + 1, mid - 1);
		postOrder(mid, e);
		System.out.println(tree[n]);
	}
}

