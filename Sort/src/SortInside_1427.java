import java.io.*;
import java.util.*;
public class SortInside_1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String n = br.readLine();
		String arr[] = n.split("");
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		br.close();
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (int element : list) {
			sb.append(element);
		}
		System.out.println(sb);
	}

}
