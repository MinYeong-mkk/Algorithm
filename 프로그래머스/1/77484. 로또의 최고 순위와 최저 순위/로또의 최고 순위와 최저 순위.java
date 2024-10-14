import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int arr[] = {6,6,5,4,3,2,1};
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        int win = 0;
        int num0 = 0;
        
        for(int num:win_nums){
            map.put(num, true);
        }
        for(int num:lottos){
            if(map.containsKey(num)) win++;
            if(num == 0) num0++;
        }
        
        answer[0] = arr[win+num0];
        answer[1] = arr[win];
        
        return answer;
    }
}