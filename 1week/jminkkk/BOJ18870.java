package jminkkk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

// 좌표 압축
public class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Integer N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] num = str.split(" "); // 원본 배열
        int[] sorted = new int[N]; // 순위를 매길 배열
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();	// 랭킹

        for (int i = 0; i < N; i++) {
            sorted[i] = Integer.parseInt(num[i]);
        }

        Arrays.sort(sorted); // 정렬

        // 순위 매기기
        int rank = 0;
        for (int i = 0; i < N; i++) {
            if (!hashMap.containsKey(sorted[i])) {
                hashMap.put(sorted[i], rank);
                rank++;
            }
        }

        for (String original : num) {
            int ranking = hashMap.get(Integer.parseInt(original));
            sb.append(ranking + " ");
        }
        System.out.println(sb);
    }
}
