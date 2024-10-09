class Solution {
    public int solution(int number, int limit, int power) {
        int nums[] = new int[number+1];
        int cnt=2;
        int sum=0;
        nums[1]=1;
        for(int i=2;i<=number;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0) cnt++;
            }
            if(cnt>limit) nums[i]=power;
            else nums[i]=cnt;
            cnt=2;
        }
        for(int i=0;i<=number;i++){
            sum+=nums[i];
        }
        return sum;
    }
}