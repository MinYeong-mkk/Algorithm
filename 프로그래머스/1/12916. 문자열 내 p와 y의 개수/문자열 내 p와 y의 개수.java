class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        boolean answer = true;
        int pcnt = 0;
        int ycnt = 0;
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='Y') ycnt++;
            else if(s.charAt(i)=='P') pcnt++;
        }
        if(pcnt==ycnt) answer = true;
        else answer = false;
        
        System.out.println("Hello Java");
        
        
        return answer;
    }
}