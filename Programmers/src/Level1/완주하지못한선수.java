package Level1;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        int i = 0;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }
}