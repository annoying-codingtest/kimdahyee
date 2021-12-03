package Level1;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        
        int i = 0;
        for (Integer integer : set) {
            answer[i++] = integer;
        }
        
        Arrays.sort(answer);
        return answer;
        
        //return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
