import java.io.*;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] selected, dwarf;
	static int sum;
	static boolean flag = false;
	public static void main(String[] args) throws IOException{
		selected = new int[7];
		dwarf = new int[9];

		for (int i = 0; i < 9; i++) dwarf[i] = Integer.parseInt(br.readLine());
		조합(0,0);
		
	}

	private static void 조합(int start, int cnt) {
		if(7==cnt) {
			sum = 0;
			for (int i = 0; i < 7; i++) sum+=selected[i];
			if(sum==100 && !flag) {
				Arrays.sort(selected);
				for (int i = 0; i < 7; i++) {
					System.out.println(selected[i]);
				}
				flag=true;
			}
			return;
		}
		for (int i = start; i < 9; i++) {
			selected[cnt] = dwarf[i];
			조합(i+1, cnt+1);
		}
	}
}
