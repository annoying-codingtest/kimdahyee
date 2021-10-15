import java.util.*;
public class Parenthesis_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.next();		
			
			String[] splitArray = new String[input[i].length()];
			splitArray = input[i].split("");
			
			int pos = 0;
			ArrayList<String> data = new ArrayList<>();
			for (int j = 0; j < splitArray.length; j++) {
				if (pos == 0) { // 스택이 비어있으면
					data.add(pos++, splitArray[j]);
				} else { 
					if (data.get(pos - 1).equals("(") && splitArray[j].equals(")")) {
						data.remove(--pos);
					} else { 
						data.add(pos++, splitArray[j]);
					}
				}
			}
			
			if (data.size() == 0) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb);
		
	}

}
