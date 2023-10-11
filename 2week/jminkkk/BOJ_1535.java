import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1535 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine()); // 사람의 수
        String[] piroStr = br.readLine().split(" ");
        String[] happyStr = br.readLine().split(" ");

        int[] piro = new int[N];
        int[] happy = new int[N];

        int[] dp = new int[100];
        // N번째 사람일 때, 남은 체력이 j일 때의 최대 기쁨 값

        for (int i = 0; i < N; i++) {
            happy[i] = Integer.parseInt(happyStr[i]);
            piro[i] = Integer.parseInt(piroStr[i]);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 99; j >= piro[i]; j--) {
                dp[j] = Math.max(dp[j- piro[i]] + happy[i], dp[j]);
            }
        }

        System.out.println(dp[99]);
    }
}