import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		int[] arr = new int[10];
		int cnt = 1;
		
		for (int i = 0; i < 10; i++) arr[i] = Integer.parseInt(br.readLine())%42;
		Arrays.sort(arr);
		for (int i = 1; i < 10; i++) if(arr[i-1]!=arr[i]) cnt++;
		System.out.println(cnt);
	}
}