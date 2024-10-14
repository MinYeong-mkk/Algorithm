import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Integer arr[] = new Integer[10000001];
        Arrays.fill(arr, 0);
        for(int v : tangerine) arr[v]++;
        Arrays.sort(arr, (o1,o2) -> o2-o1);
        
        int index = 0;
        while(k>0){
            k-=arr[index];
            index++;
        }
        return index;
    }
}