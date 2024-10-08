import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            int x = 약수(i);
            if(x > limit) x = power;
            System.out.print(x + " ");
            answer+=x;
        }
        return answer;
    }
    public static int 약수(int n){
        if(n == 1) return 1;
        int cnt = 0;
        int rootN = (int)Math.ceil(Math.sqrt(n));
        for(int i=2; i<rootN; i++) if(n%i==0) cnt+=2;
        if(rootN*rootN == n) cnt++;
        return cnt+2;
    }
}