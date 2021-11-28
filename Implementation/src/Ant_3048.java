import java.io.*;
import java.util.*;
public class Ant_3048 {

	static int n1, n2, t;
    static ArrayList<Node> list = new ArrayList<>();
    static StringBuffer sb = new StringBuffer();
    
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        
        char[] temp1 = br.readLine().toCharArray();
        
        for (int i = n1 - 1; i >= 0 ; i--) { // 첫 번째 그룹(true)은 역순으로
            list.add(new Node(temp1[i], true));
        }
        
        char[] temp2 = br.readLine().toCharArray();
        
        for (int i = 0; i < n2; i++) {
            list.add(new Node(temp2[i], false)); // 두 번째 그룹(false)
        }
        
        t = Integer.parseInt(br.readLine());
        
        // 시뮬레이션 이전에 체크
        if (n2 + n1 - 1 <= t) {
            for (int i = 0; i < temp2.length; i++) {
                sb.append(temp2[i]);
            }
            
            for (int i = temp1.length - 1; i >= 0; i--) {
                sb.append(temp1[i]);
            }
            
            System.out.println(sb.toString());
            return;
        }
        
        while (t --> 0) {
            for (int i = 0; i < list.size() - 1; i++) {
                Node cur = list.get(i);
                Node next = list.get(i + 1);
                
                if (!cur.team || cur.team == next.team) continue;
                
                list.set(i, next);
                list.set(i + 1, cur);
                i++;
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c);
        }
        System.out.println(sb.toString());    
    }
   
}

class Node {
    char c;
    boolean team;
    
    Node(char c, boolean team) {
        this.c = c;
        this.team = team;
    }
}

/*
public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int n1 = Integer.parseInt(st.nextToken());
	int n2 = Integer.parseInt(st.nextToken());
	
	String s1 = br.readLine();
	String s2 = br.readLine();
	
	int t = Integer.parseInt(br.readLine());
	
	StringBuffer stringBuffer = new StringBuffer(s1);
	s1 = stringBuffer.reverse().toString();
	
	String concat = s1.concat(s2); // CBADEF
	String[] current =  concat.split("");
	
	if (t == 0) {
		System.out.println(concat);
        return;
	} else {
		for (int i = 1; i <= t; i++) {
			int start = n1 - i;
			int end = n1 + (i - 1);
			
			if (start < 0 || end < 0) {
				break;
			}
			
			for (int j = start; j < end; j += 2) {
				String tmp = current[j];
				current[j] = current[j + 1];
				current[j + 1] = tmp;
			}
		}
	}
	
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < current.length; i++) {
		sb.append(current[i]);
	}
	System.out.println(sb);
}
 */

