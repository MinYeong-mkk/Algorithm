import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') {
                cnt=-1;
                sb.append(s.charAt(i));
            }
            else if(cnt%2==0) sb.append(Character.toUpperCase(s.charAt(i)));
            else if(cnt%2!=0)sb.append(Character.toLowerCase(s.charAt(i)));
            cnt++;
        }
        return sb.toString();
    }
}