import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] dp = new int[N + 1];

        dp[1] = 0;

        if (N == 1) {
            System.out.println(0);
            return;
        }

        dp[2] = 1;

        for (int i = 3; i <= N; i++) {
            if (i % 6 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i / 2] + 1);
            }

            else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 3] + 1);
            }

            else if (i % 2 == 0) {
                dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2] + 1);
            }

            else dp[i] = dp[i - 1] + 1;
        }

        System.out.println(dp[N]);
    }
}
