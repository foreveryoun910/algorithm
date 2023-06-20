import java.lang.Math;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int product = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            product *= num_list[i];
            sum += num_list[i];
        }
        answer = (product < Math.pow(sum, 2)) ? 1 : 0;
        return answer;
    }
}
