class Solution {
    boolean solution(String s) {
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') cnt++;
            else if(cnt <= 0) return false;
            else cnt--;
        }
        return (cnt == 0 ? true : false);
    }
}