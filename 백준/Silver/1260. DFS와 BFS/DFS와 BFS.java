import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int N, M, V;
    static boolean[] visited;
    static boolean[][] graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = graph[v][u] = true;
        }

        visited[V] = true;
        sb.append(V).append(" ");
        dfs(V);

        sb.append("\n");

        Arrays.fill(visited, false);
        bfs();

        System.out.println(sb);
    }

    static void dfs(int v) {
        for (int i = 1; i <= N; i++) {
            if (graph[v][i] && !visited[i]) {
                visited[i] = true;
                sb.append(i).append(" ");
                dfs(i);
            }
        }
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            sb.append(v).append(" ");

            for (int i = 1; i <= N; i++) {
                if (graph[v][i] && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
