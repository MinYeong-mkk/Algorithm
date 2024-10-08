import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        return (int)Math.min(set.size(), nums.length/2);
    }
}