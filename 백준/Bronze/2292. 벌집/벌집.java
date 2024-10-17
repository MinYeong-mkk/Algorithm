import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int i = 1;
		while(N>0) {
			if(cnt==1) i = 6;
			else if(cnt>1) i += 6;
			cnt++;
			N -= i;
		}
		
		System.out.println(cnt);
	}

}