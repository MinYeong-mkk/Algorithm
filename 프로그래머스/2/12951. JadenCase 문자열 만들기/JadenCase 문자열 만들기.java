class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        if((int)s.charAt(0)>=97) sb.append(Character.toUpperCase(s.charAt(0)));
        else sb.append(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            if((int)s.charAt(i)>=97){
                if((int)s.charAt(i-1)==32) sb.append(Character.toUpperCase(s.charAt(i)));
                else sb.append(s.charAt(i));
            }
            else if((int)s.charAt(i)>=65){
                if((int)s.charAt(i-1)==32) sb.append(s.charAt(i));
                else sb.append(Character.toLowerCase(s.charAt(i)));
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}