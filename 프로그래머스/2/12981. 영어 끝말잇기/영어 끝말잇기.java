import java.util.*;

class Solution {
    static Character end = '0';
    static HashSet<String> set = new HashSet<>();
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        for(int i=0; i<words.length; i++){
            if(!endTest(words[i])) {
                answer[1] = (i+1)/n;
                answer[0] = i%n+1;
                if((i+1)%n > 0) answer[1]++;
                // System.out.println(i);
                break;
            }
            set.add(words[i]);
            end = words[i].charAt(words[i].length()-1);
        }
        return answer;
    }
    public static boolean endTest(String word){
        if((!set.contains(word) && word.charAt(0) == end) || end == '0') return true;
        return false;
    }
}