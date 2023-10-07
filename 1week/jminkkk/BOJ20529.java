package jminkkk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 가장 가까운 세 사람의 심리적 거리
public class BOJ20529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer T = Integer.parseInt(br.readLine());
        Integer[] answer = new Integer[T];

        for (int i = 0; i < T; i++) {
            Integer N = Integer.parseInt(br.readLine());
            String[] mbti = br.readLine().split(" ");

            // 3개를 각각 다음 것과 비교해서
            answer[i] = checkDifferChar(mbti);
        }

        Arrays.stream(answer).forEach(System.out::println);
    }

    static int checkDifferChar(String[] mbti) {
        int min = 8;

        // 비둘기집
        if (mbti.length >= 33) return 0;

        for (int j = 0; j < mbti.length; j++) {
            for (int k = j + 1; k < mbti.length; k++) {
                for (int h = k + 1; h < mbti.length; h++) {
                    int sum = 0;

                    for (int i = 0; i < 4; i++) {
                        // EEE III EEI EII -> 즉 무조건 0 아니면 2 -> 다 같은지만 체크하기
                        if (mbti[j].charAt(i) != mbti[k].charAt(i) ||
                                mbti[j].charAt(i) != mbti[h].charAt(i)) sum += 2;
                    }

                    min = Math.min(sum, min);
                }
            }
        }
        return min;
    }
}