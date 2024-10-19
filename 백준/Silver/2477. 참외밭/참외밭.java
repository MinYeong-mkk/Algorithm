import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    
	    int N = Integer.parseInt(br.readLine());//참외 개수
	    int[]arr = new int[6];
	    int MWI=0,MW=0,MH=0,MHI=0,d;
	    int SW = 0, SH = 0;
	    for(int i=0; i<6; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	d = Integer.parseInt(st.nextToken());// 각 방향
	    	arr[i]=Integer.parseInt(st.nextToken());
			//가장 긴 가로의 길이와 위치 찾기
	    	if(d<=2 && MW<arr[i]) {
	    		MW=arr[i];
	    		MWI=i;
	    	}
			//가장 긴 세로의 길이와 위치 찾기
	    	else if(d>=3 && MH<arr[i]){
	    		MH=arr[i];
	    		MHI=i;
	    	}
	    }
	    SW = arr[(MWI + 1) % 6]>arr[(MWI + 5) % 6]? arr[(MWI + 1) % 6]-arr[(MWI + 5) % 6]:arr[(MWI + 5) % 6]-arr[(MWI + 1) % 6];	    
	    SH = arr[(MHI + 1) % 6]>arr[(MHI + 5) % 6]? arr[(MHI + 1) % 6]-arr[(MHI + 5) % 6]:arr[(MHI + 5) % 6]-arr[(MHI + 1) % 6];
	    
	    System.out.println((MW*MH-SW*SH)*N);
	}
}
