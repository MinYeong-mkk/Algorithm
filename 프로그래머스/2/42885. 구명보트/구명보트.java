import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        
        int j =people.length-1;
        
        for(int i=0; i<=people.length/2; i++){
            while(j > i){
                if(people[i]+people[j]<=limit){
                    answer++;
                    people[i]=0;
                    people[j]=0;
                    j--;
                    break;
                }
                j--;
            }
        }
        
        for(int i=0;i<people.length;i++) if(people[i]!=0) answer++;
        return answer;
    }
}