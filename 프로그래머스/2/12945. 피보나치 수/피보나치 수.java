class Solution {
    public long solution(int n) {
        return fibo(n);
    }
    public static long fibo(int n){
        long pref=1;
        long temp=0;
        long f=0;
        for(int i=1;i<=n;i++){
            temp = f;
            f = (f+pref)%1234567;
            pref=temp;
        }
        return f;
    }
}