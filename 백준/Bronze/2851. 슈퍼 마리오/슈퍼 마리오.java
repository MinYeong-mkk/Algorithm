import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int prev = 0;
		int result = 0;
		
		for (int i = 0; i < 10; i++){
			if(result>=100) break;
			prev = result;
			result += Integer.parseInt(br.readLine());
		}
		result = result - 100 > 100 - prev ? prev : result;
		System.out.println(result);
	}
}