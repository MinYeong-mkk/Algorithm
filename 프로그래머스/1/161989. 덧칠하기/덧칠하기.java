import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean wall[] = new boolean[n+1];
        for(int num:section) wall[num] = true;
        
        for(int i=1;i<=n;i++){
            if(wall[i]){
                i = i+m-1;
                answer++;
            } 
        }
        return answer;
    }
}