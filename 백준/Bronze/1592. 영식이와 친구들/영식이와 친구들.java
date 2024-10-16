import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());//사람 수
		int M = Integer.parseInt(st.nextToken());//공을 받는 횟수
		int L = Integer.parseInt(st.nextToken());//공을 받는 사람의 거리
		int cnt = 0;
		int[] round = new int[N];
		int i = 0;
		while(true) {
			round[i]++;
			if(round[i] == M) break;
			if(round[i]%2==0) i-=L;
			else i += L;
			
			if(i>=N) i%=N;
			else if(i<0) i+=N;
			cnt++;
		}
		System.out.println(cnt);
	}
}