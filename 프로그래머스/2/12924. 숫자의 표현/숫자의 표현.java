class Solution {
    public int solution(int n) {
        int sum = 0;
        int cnt=0;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=j;
                if(sum==n) cnt++;
                if(sum>=n) {
                    sum=0;
                    break;
                }
            }
        }
        return cnt+1;
    }
}