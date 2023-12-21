import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1303 {
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int aSum = 0;
    static int aCount = 0;
    static int jSum = 0;
    static int jCount = 0;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        M = Integer.parseInt(arr[0]);
        N = Integer.parseInt(arr[1]);
        map = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < M; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, map[i][j]);
                    aSum += aCount * aCount;
                    jSum += jCount * jCount;

                    jCount = 0;
                    aCount = 0;
                }
            }
        }

        System.out.println(aSum + " " + jSum);
    }

    public static void dfs(int x, int y, char color) {
        visited[x][y] = true;

        if (color == 'W') {
            aCount++;
        } else {
            jCount++;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M
                    && (map[nx][ny] == color) && !visited[nx][ny]) {
                dfs(nx, ny,  color);
            }
        }
    }
}
