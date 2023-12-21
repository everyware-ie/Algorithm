import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_2606 {
    static boolean[][] visited;
    static int[][] graph;
    static Set<Integer> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int nodes = Integer.parseInt(br.readLine());

        graph = new int[N][N];
        visited = new boolean[N][N];
        set = new HashSet<>();

        for (int i = 0; i < nodes; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            graph[a - 1][b - 1] = 1;
            graph[b - 1][a - 1] = 1;
        }

        dfs(0);

        if (set.size() == 0) {
            System.out.println(0);
            return;
        }

        System.out.println(set.size() - 1);
    }

    public static void dfs(int start) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visited[start][i]) {
                visited[start][i] = true;
                set.add(i);
                set.add(start);
                dfs(i);
            }
        }
    }
}
