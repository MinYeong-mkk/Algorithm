import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visit;
    static int[][] maze;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int N,M;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = s.charAt(j) - '0';
            }
        }
        visit[0][0] = true;
        bfs(0,0);
        System.out.println(maze[N-1][M-1]);

    }

    static void bfs(int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i,j});

        while (!q.isEmpty()) {
            int now[] = q.poll();
            int x = now[0];
            int y = now[1];
            for (int k = 0; k < 4; k++) {
                int nextX = x + dx[k];
				int nextY = y + dy[k];
				
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if (visit[nextX][nextY] || maze[nextX][nextY] == 0)
                    continue;
            
                q.add(new int[] {nextX, nextY});
                maze[nextX][nextY] = maze[x][y] + 1;
                visit[nextX][nextY] = true;
            }
        }

    }
}
