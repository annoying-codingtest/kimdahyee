import java.io.*;
import java.util.Arrays;
public class SortWords_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = br.readLine();
		}
		String[] words = Arrays.stream(input).distinct().toArray(String[]::new);
		
		Arrays.sort(words, (e1, e2) -> {
			if (e1.toString().length() == e2.toString().length()) { //길이가 같으면 사전순
				return e1.compareTo(e2);
			} else {
				return e1.toString().length() - e2.toString().length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i]).append("\n");
		}
		System.out.println(sb);
	}

}
