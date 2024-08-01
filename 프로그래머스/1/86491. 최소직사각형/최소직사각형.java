import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        
        for(int i=0;i<sizes.length;i++){
            min.add(Math.min(sizes[i][0], sizes[i][1]));
            max.add(Math.max(sizes[i][0], sizes[i][1]));
        }
        answer =Collections.max(min)*Collections.max(max);
        return answer;
    }
}