import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//피보나치 수2
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibo(n));
	}
	static BigInteger fibo(int n) {
		BigInteger[] a = new BigInteger[n+1];
		a[0] = BigInteger.valueOf(0);
		a[1] = BigInteger.valueOf(1);
		
		for (int i = 2; i <= n; i++) {
			a[i] = a[i-1].add(a[i-2]);
		}
		
		return a[n];
	}
}