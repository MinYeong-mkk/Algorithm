import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(br.readLine());
		int[][] square = new int[101][101];
		int x, y;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			for (int j = x; j < x+10; j++) {
				for (int j2 = y; j2 < y+10; j2++) square[j][j2] = 1;
			}
		}
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square.length; j++) 
				if(square[i][j]==1) cnt++;
		}
		System.out.println(cnt);
	}
}