import java.util.*;

class Solution {
    static int answer, cnt;
    static char key = '0';
    public int solution(String s) {
        for(int i=0; i<s.length(); i++){
            if(cnt == 0) keyChange(s, i);
            else{
                if(s.charAt(i) == key) cnt++;
                else cnt--;
            }
        }
        return answer;
    }
    public static void keyChange(String s, int i){
        key = s.charAt(i);
        answer++;
        cnt++;
    }
}