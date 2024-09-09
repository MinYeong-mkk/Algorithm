class Solution {
    public int solution(int n) {
        StringBuilder sbn = new StringBuilder();
        StringBuilder sbr = new StringBuilder();
        int temp1 = n;
        int temp2 = 0;
        int cnt1=0;
        int cntr=0;
        while(temp1>0){
            if(temp1%2==1) cnt1++;
            temp1=temp1/2;
        }
        
        while(cnt1!=cntr){
            n+=1;
            temp2=n;
            cntr=0;
            while(temp2>0){
                if(temp2%2==1) cntr++;
                temp2=temp2/2;
            }
        }
        return n;
    }
}