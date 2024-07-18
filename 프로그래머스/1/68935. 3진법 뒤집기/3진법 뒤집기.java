import java.util.*;
import java.io.*;

class Solution {
    public int solution(long n) {
        int answer = 0;
        int v = 1;
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        n = Long.parseLong(sb.toString());
        while(n>0){
            answer+=(n%10)*v;
            n=n/10;
            v *= 3;
        }
        return answer;
    }
}