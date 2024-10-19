import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	static int[] dwarf = new int[9];
	static int[] real = new int[7];
	static int sum;
	static boolean flag;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			dwarf[i] = Integer.parseInt(br.readLine());
		}
		comb(0, 0);
		
	}
	static void comb(int dwarfIdx, int realIdx) {
		if(realIdx == 7) {
			sum=0;
			for (int i = 0; i < real.length; i++) {
				sum += real[i];
			}
			if(sum==100) {
				flag = true;
				Arrays.sort(real);
				for (int j = 0; j < real.length; j++) {
					System.out.println(real[j]);
					
				}
			}
			return;
		}
		for (int i = dwarfIdx; i < dwarf.length; i++) {
			real[realIdx] = dwarf[i];
			comb(i+1,realIdx+1);
			if(flag) {
				return;
			}
		}
	}
}