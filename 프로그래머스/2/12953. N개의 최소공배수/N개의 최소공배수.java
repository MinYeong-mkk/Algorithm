class Solution {
    public int solution(int[] arr) {
        int lcm = 0;
        for(int i=0;i<arr.length-1;i++) arr[i+1] = arr[i]*arr[i+1]/gcd(arr[i], arr[i+1]);
        return arr[arr.length-1];
    }
    
    public static int gcd(int p, int q){
	    if (q == 0) return p;
	    return gcd(q, p%q);
    }
}