import java.util.*;

class Solution {
    public int[] solution(String s) {
        int size = s.length();
        int[] answer = new int[size];
        Arrays.fill(answer, -1);
        for(int i=1;i<size;i++){
            int cnt = 0;
            for(int j=i-1;j>=0;j--){
                cnt++;
                if(s.charAt(i)==s.charAt(j)){
                    answer[i] = cnt;
                    break;
                }
            }
        }
        return answer;
    }
}