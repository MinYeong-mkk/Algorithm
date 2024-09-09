import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(32==s.charAt(i)){
                sb.append(s.charAt(i));
            } 
            else if(s.charAt(i)<=90){
                if(s.charAt(i)+n <= 90) sb.append((char)(s.charAt(i)+n));
                else sb.append((char)(s.charAt(i)+n-26));
            }
            else {
                if(s.charAt(i)+n <= 122) sb.append((char)(s.charAt(i)+n));
                else sb.append((char)(s.charAt(i)+n-26));
            }
        }

        return sb.toString();
    }
}