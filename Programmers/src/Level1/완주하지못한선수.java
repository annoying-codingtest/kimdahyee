package Level1;
import java.util.Arrays;

class 완주하지못한선수 {
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