class Solution {
    public int solution(int n) {
        int answer = 0;
        int nums[] = new int[n+1];
        for(int i=0;i<n+1;i++) nums[i]=i;
        
        for(int i=2;i<n+1;i++){
            for(int j=i+i;j<n+1;j=j+i) nums[j]=0;
        }
        for(int i=2;i<n+1;i++){
            if(nums[i]!=0) answer++;
        }
        return answer;
    }
}