import java.util.*;

class Solution {
    public int solution(String s) {
        char key = s.charAt(0);
        int keycnt = 1;
        int notkeycnt = 0;
        int cnt = 0;
        for(int i=1;i<s.length();i++){
            if(key==s.charAt(i)) keycnt++;
            else notkeycnt++;
            if(keycnt==notkeycnt) {
                if(i==s.length()-1) {
                    cnt++;
                    break;
                }else{
                    cnt++;
                    key = s.charAt(++i);
                    keycnt = 1;
                    notkeycnt = 0;
                }     
            }
            if(i==s.length()-1) {
                cnt++;
                break;
            }
        }
        return s.length()==1 ? 1 : cnt;
    }
}