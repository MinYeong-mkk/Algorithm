import java.util.*;

class Solution{
    public int solution(String s){
        Deque<Character> st = new LinkedList<>();
        
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }
            if(st.getFirst() == s.charAt(i)) {
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        
        return st.isEmpty() ? 1:0;
    }
}