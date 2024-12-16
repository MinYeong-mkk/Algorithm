import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit;
    static boolean[][] graph;
    static int count, N, M;
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new boolean[N+1][N+1];
        visit = new boolean[N+1];
        count = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = true;
        }
        for (int i = 1; i <= N; i++) {
            if(!visit[i]){
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }
    static void dfs(int c){
        if(visit[c]) return;
        else{
            visit[c] = true;
            for (int i = 1; i <= N; i++) {
                if(graph[c][i]) dfs(i);
            }
        }
    }
}