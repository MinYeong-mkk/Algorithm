import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        int n = 0;
        for(int i=0;i<d.length;i++){
            n+=d[i];
            if(n>budget) break;
            cnt++;
        }
        
        
        return cnt;
    }
}