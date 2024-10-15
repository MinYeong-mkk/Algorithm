import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<skip.length();i++){
            set.add(skip.charAt(i) - 'a');
        }

        for(int i=0;i<s.length();i++){
            int origin_idx = s.charAt(i) - 'a';
            for(int j=0; j<index; j++){
                origin_idx++;
                origin_idx%=26;
                while(set.contains(origin_idx)){
                    origin_idx++;
                    origin_idx%=26;
                }
            }
            sb.append((char)(origin_idx+'a'));
        }
        
        
        return sb.toString();
    }
}