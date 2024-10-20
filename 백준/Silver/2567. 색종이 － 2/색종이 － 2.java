import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int R, C, map[][];
	static int dirs[][] = {{-1,0},{0,1},{1,0},{0,-1}};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str[] = br.readLine().split(" ");
		R = 101;
		C = 101;
		map = new int[R][C];
		int N =  Integer.parseInt(str[0]);
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);
			for(int j=0; j<10; j++)
				for(int k=0; k<10; k++)
					map[j+r][k+c] = 1;
		}
		int cnt =0;
		for(int i=1; i<101; i++) {
			for(int j=1; j<101; j++) {
				if(map[i][j] == 1) {
					for(int dir[] : dirs) {
						int nr = i+dir[0];
						int nc = j+dir[1];
						if(nr>=0 && nr<R && nc>=0 && nc<C && map[nr][nc] == 0) {
							cnt++;
						}
					}
				}
			}
		}
		
		sb.append(cnt);
		System.out.println(sb.toString());
	}
}
