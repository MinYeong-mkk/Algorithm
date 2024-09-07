class Solution {
    public int[] solution(String s) {
        int len=0;
        int cnt0=0;
        int cnt1=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1') len++;
            else cnt0++;
        }
        while(len!=1){
            while(len>0){
                if(len%2==1) {
                    cnt1++;
                }
                else cnt0++;
                len/=2;
            }
            len=cnt1;
            cnt1=0;
            cnt++;
        }
        int[] answer = new int[]{cnt+1, cnt0};
        return answer;
    }
}