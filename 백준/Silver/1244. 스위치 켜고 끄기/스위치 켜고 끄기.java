import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static int[] arr;
	static int N;
	public static void main(String[] args) throws Exception{
		N = Integer.parseInt(br.readLine());//스위치 개수
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		int students = Integer.parseInt(br.readLine()); //학생 수
		for (int i = 0; i < students; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken()); //성별
			int num = Integer.parseInt(st.nextToken());//스위치 번호
			if(gender==1) 남자(num);
			else 여자(num);
		}
		for(int i=0; i<N; i++) { 
			sb.append(arr[i] + " ");
			if(i%20==19) {
				sb.setLength(sb.length()-1);
				sb.append("\n");
			}
		}
		sb.setLength(sb.length()-1);
		System.out.print(sb);
	}
	private static void 여자(int num) {
		int a = num-1;
		int b = num-1;
		change(num-1);
		while(true) {
			if(a >= 0 && a < N && b >= 0 && b < N && arr[a] == arr[b]) {
				change(a);
				change(b);
			}else break;
			a++;
			b--;
		}
		
	}
	private static void 남자(int num) {
		for(int i=num-1; i<N; i+=num) 
			change(i);
	}
	public static void change(int n) {
		arr[n] = arr[n] == 1 ? 0:1;
	}
}
