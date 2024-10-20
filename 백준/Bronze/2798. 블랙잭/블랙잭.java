import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] selected, arr;
	static int sum, N, M, answer;

	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		selected = new int[3];
		answer = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		comb(0,0);
		System.out.println(answer);
	}

	private static void comb(int start, int cnt) {
		if(3==cnt) {
			sum = 0;
			for (int i = 0; i < 3; i++) sum+=selected[i];
			if(sum<=M) answer = M-answer > M-sum ? sum : answer;
			return;
		}
		for (int i = start; i < N; i++) {
			selected[cnt] = arr[i];
			comb(i+1, cnt+1);
		}
	}
}
