import java.util.*;
import java.io.*;

class Solution {
    public ArrayList solution(int n, int m) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(gcd(n,m));
        al.add(lcm(n,m));
        return al;
    }
    public static int gcd(int n, int m){
        if(m==0) return n;
        return gcd(m, n%m);
    }
    public static int lcm(int n, int m){
        return n*m/gcd(n, m);
    }
    
}