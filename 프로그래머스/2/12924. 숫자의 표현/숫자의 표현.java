class Solution {
    public int solution(int n) {
        int sum = 0;
        int i=0;
        int cnt=0;
        
        while(sum+i<n){
            i++;
            sum+=i;
        }
        while(i!=0){
            if((n-sum)%i==0) cnt+=1;
            sum-=i;
            i-=1;
        }
        return cnt;
    }
}