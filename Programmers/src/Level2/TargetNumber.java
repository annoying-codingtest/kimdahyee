package Level2;

class Solution {
    
    static int  answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public static void dfs(int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) { //탐색 완료
            if(sum == target)
                answer++;
            return;
        }
        
        sum += numbers[idx];
        
        dfs(numbers, target, idx + 1, sum);
        
        sum -= numbers[idx];
        
        sum += (numbers[idx] * -1);
        
        dfs(numbers, target, idx + 1, sum);
    }
}