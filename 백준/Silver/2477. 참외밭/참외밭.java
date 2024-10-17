import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max_col = 0;
		int max_vol= 0;
		int min_col= 501;
		int min_vol= 501;
		N = Integer.parseInt(br.readLine());
		int[] array = new int[6];
		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int j = 0; j < 6; j++) {
			if(j%2 == 0) {
				if(max_col<array[j]) {
					max_col = array[j];
				}
			}else {
				if(max_vol<array[j]) {
					max_vol = array[j];
				}
			}
		}
		for (int j = 0; j < 6; j++) {
			if(j%2 == 0) {
				if(max_vol == array[(j+5)%6]+array[(j+1)%6]) {
					min_col = array[j];
				}
			}else {
				if(max_col == array[(j+5)%6]+array[(j+1)%6]) {
					min_vol = array[j];
				}
			}
		}
		System.out.println((max_vol*max_col-min_vol*min_col)*N);
	}
}