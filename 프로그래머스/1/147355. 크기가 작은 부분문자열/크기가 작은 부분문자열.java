import java.util.*;
import java.io.*;

class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        StringBuilder sbt = new StringBuilder(t);
        StringBuilder sbp = new StringBuilder(p);

        for(int i=0;i<=t.length()-p.length();i++){
            if(Long.parseLong(t.substring(i,p.length()+i))<=Long.parseLong(p)){
                cnt++;
            } 
        }
        
        return cnt;
    }
}