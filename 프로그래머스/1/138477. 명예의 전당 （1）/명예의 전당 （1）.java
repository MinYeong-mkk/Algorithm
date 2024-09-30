import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<score.length;i++){
            pq.offer(score[i]);
            while(true){
                if(pq.size()>k) pq.poll();
                else{
                    answer[i]=pq.peek();
                    break;
                }
            }
        }
        return answer;
    }
}