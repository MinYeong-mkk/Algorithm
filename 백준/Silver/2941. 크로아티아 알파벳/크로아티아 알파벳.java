import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			str = str.replace("c=", " ");
			str = str.replace("c-", " ");
			str = str.replace("dz=", " ");
			str = str.replace("d-", " ");
			str = str.replace("lj", " ");
			str = str.replace("nj", " ");
			str = str.replace("s=", " ");
			str = str.replace("z=", " ");
		}
		System.out.println(str.length());
	}
}
