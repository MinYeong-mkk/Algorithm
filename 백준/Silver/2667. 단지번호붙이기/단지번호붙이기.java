import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N, count;
    static boolean[][] visited;
    static boolean[][] map;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static ArrayList<Integer> danji;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        map = new boolean[N][N];
        visited = new boolean[N][N];
        danji = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                if (line.charAt(j) == '1') {
                    map[i][j] = true;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    danji.add(count);
                }
            }
        }
        Collections.sort(danji);
        System.out.println(danji.size());
        for (int size : danji) {
            System.out.println(size);
        }
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < N && cy < N) {
                if (!visited[cx][cy] && map[cx][cy]) {
                    dfs(cx, cy);
                }
            }
        }
    }
}
