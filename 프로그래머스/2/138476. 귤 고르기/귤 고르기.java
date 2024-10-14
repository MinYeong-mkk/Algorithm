import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(tangerine);
        
        int temp = 0;
        int 압좌 = -1; // 압축될 좌표
        for(int i=0; i<tangerine.length; i++){
            if(temp == tangerine[i]) list.set(압좌, list.get(압좌)+1);
            else{
                list.add(1);
                압좌++;
                temp = tangerine[i];
            }
        }
        Collections.sort(list, (o1,o2) -> o2-o1);
        int index = 0;
        while(k>0){
            k-=list.get(index);
            index++;
        }
        return index;
    }
}