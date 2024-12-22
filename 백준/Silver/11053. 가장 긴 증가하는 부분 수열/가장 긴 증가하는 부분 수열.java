import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//가장 긴 증가하는 수열
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] a = new int[N];
		int[] dp = new int[N+1];
		int result = 0;
		Arrays.fill(dp, 1);
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if(a[j]<a[i]) dp[i] = Math.max(dp[i], dp[j]+1);
			}
		}
		
		for (int i = 0; i < N; i++) result = Math.max(result, dp[i]);
		
		System.out.println(result);
	}
}