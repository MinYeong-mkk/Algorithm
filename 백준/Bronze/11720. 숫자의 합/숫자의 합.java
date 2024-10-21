import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int ans = 0;
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            ans+=str.charAt(i)-'0';
        }
        System.out.println(ans);
    }
}