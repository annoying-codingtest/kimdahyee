import java.util.*;
import java.io.*;
public class 킹_1063 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 돌은 킹과 이동할 방향이 같은 경우에만 이동을 고려
		 * 킹과 같은 방향이면서 범위를 벗어나지 않는 경우에만 이동
		 * 같이 방향이지만 킹과 돌 둘 중 하나가 범위를 벗어나는 경우 둘 다 이동 X
		 * 
		 * 킹은 돌과 다른 방향이면서 범위를 안벗어날 경우,
		 * 돌과 같은 방향이면서 킹과 돌 모두 범위를 안벗어나는 경우에만 이동
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		char[] king = st.nextToken().toCharArray(); // [0]:열  [1]:행
		char[] stone = st.nextToken().toCharArray();
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			
			char[] next_king = king.clone();
			char[] next_stone = stone.clone();
			
			move(input, next_king);
			
			if (range(next_king)) { 
				continue;
			}
			
			// 이미 킹은 범위를 안벗어나는 상태
			if (Arrays.equals(next_king, next_stone)) { // 돌과 방향이 같으면
				move(input, next_stone); // 돌이 이동할 위치가 범위를 벗어나는지 확인
				if (range(next_stone)) {
					continue;
				}
			}
			
			king = next_king;
			stone = next_stone;
		}
		
		System.out.println(king);
		System.out.println(stone);
		
	}
	
	static boolean range(char[] next) {
		// 이동할 위치가 범위를 벗어나면 return true
		return (next[0] < 'A' || next[0] > 'H' || next[1] < '1' || next[1] > '8');
	}
	
	static void move(String input, char[] next) {
		switch (input) {
			case "R": next[0]++; break;
			case "L": next[0]--; break;
			case "B": next[1]--; break;
			case "T": next[1]++; break;
			case "RT": next[0]++; next[1]++; break;
			case "LT": next[0]--; next[1]++; break;
			case "RB": next[0]++; next[1]--; break;
			case "LB": next[0]--; next[1]--; break;
		}
	}
}
