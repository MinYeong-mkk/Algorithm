import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int arr[] = {6,6,5,4,3,2,1};
        
        ArrayList<Integer> al = new ArrayList<>();
        int win = 0;
        int num0 = 0;
        for(int num:lottos){
            if(num!=0){
                al.add(num);
            }else num0++;
        }
        for(int num:win_nums){
            if(al.contains(num)) {
                win++;
            }
        }
        
        answer[0] = arr[win+num0];
        answer[1] = arr[win];
        
        return answer;
    }
}