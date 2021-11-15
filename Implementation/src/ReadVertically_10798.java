import java.io.*;
public class ReadVertically_10798 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] input = new String[5][15];

		for (int i = 0; i < 5; i++) {
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				input[i][j] = String.valueOf(s.charAt(j));
			}
		}
		
		StringBuilder sb = new StringBuilder();		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (input[j][i] == null) {
					continue; 
				} else {
					sb.append(input[j][i]); 
				} 
			}
		}
		System.out.print(sb);
	}
}
