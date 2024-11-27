import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M, count;
    static boolean[][] network;
    static boolean[] computer;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); //컴퓨터 개수
        M = Integer.parseInt(br.readLine()); //연결된 간선 수
        StringTokenizer st;
        network = new boolean[N+1][N+1];
        computer = new boolean[N+1];
        count = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            network[r][c] = network[c][r] = true;    
        }
        computer[1] = true;
        dfs(1);

        System.out.println(count);
        
    }
    static void dfs(int v) {
        for (int i = 1; i <= N; i++) {
            if (network[v][i] && !computer[i]) {
                computer[i] = true;
                count++;
                dfs(i);
            }
        }
    }
}
