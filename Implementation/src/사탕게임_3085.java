import java.io.*;
public class 사탕게임_3085 {
	
	static int [] dx = {-1, 0, 1, 0};
    static int [] dy = {0, 1, 0, -1};
    static int n, max = 0;
    static char [][] map;
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		changeCandy();
		
		System.out.println(max);
		
	}
	
	public static void changeCandy() {
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				for (int d = 0; d < 4; d++) { // 상 하 좌 우 인접한곳
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    
                    if (range(nx,ny) && map[x][y] != map[nx][ny]) {
                        char temp = map[x][y];
                        map[x][y] = map[nx][ny];
                        map[nx][ny] = temp; // swap
                        
                        check();
                        
                        temp = map[x][y];
                        map[x][y] = map[nx][ny];
                        map[nx][ny] = temp; // 원상복귀
                    }
                }
			}
		}
	}
	
	public static boolean range(int x, int y) {
		// 범위 벗어나는지 확인
        return x >= 0 && x < n && y >= 0 && y < n;
    }
    
    public static void check() {
    	// 먹을 수 있는 사탕 개수 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count(i, j); // 행열 확인 후 최대값 구해
            }
        }    
    }
    
    public static void count(int x, int y) {       
        int xx = x, yy = y; // 기준
        int row = 1, col = 1;
        
        //연속된 행
        for (int i = y + 1; i < n; i++) {
            if (map[x][yy] == map[x][i]) {
                row++;
                yy = i; 
            } else break;
        }
        
        //연속된 열
        for (int i = x + 1; i < n; i++) {
            if (map[xx][y] == map[i][y]) {
                col++;
                xx = i;
            } else break;
        }
        
        int result = Math.max(row, col);
        max = Math.max(result, max);
    }

}
