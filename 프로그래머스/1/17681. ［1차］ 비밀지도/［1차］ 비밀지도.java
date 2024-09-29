class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        int[] arr3 = new int[n];
        for(int i=0; i<n; i++) arr3[i] = arr1[i]|arr2[i];
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            while(arr3[i] > 0){
                if(arr3[i] % 2 == 1) sb.append("#");
                else sb.append(" ");
                arr3[i]=arr3[i]/2;
            }
            System.out.println(n + " " + sb.length());
            int diff = n-sb.length();
            for(int j=0; j<diff; j++) sb.append(" ");
            sb.reverse();
            answer[i] =sb.toString();
        }
        return answer;        
    }
}