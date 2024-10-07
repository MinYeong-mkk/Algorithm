import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] A = new int[N];
		int P = 0;
        int cnt = N;
		for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);
		for (int i = 0; i < N; i++){
            P += A[i]*cnt;
            cnt--;
        }
		System.out.println(P);
	}
}