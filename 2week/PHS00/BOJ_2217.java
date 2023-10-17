package PHS00;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 로프
public class BOJ_2217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> ropes = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            ropes.add(scanner.nextInt());
        }
        Collections.sort(ropes);    // 오름차순 정렬
        Collections.reverse(ropes);    // 내림차순 정렬
        // n 개의 로프로 들어올린다
        // 그런데 예를들어 1개의 로프로 들어올리는 경우가 더 좋을 수 있음
        // ex) 10, 1 이면 2개로 들면 2만큼 들어올리고 1개로 들면 10까지 올릴 수 있음
        // 1. 제일 무거운 로프로 잴 수 있는 무게는 로프가 들 수 있는 최대 무게임
        // 2. 그 다음 무거운 로프를 추가해서 2개의 로프로 들 수 있는 최대 무게는 이 과정에서 추가된 로프의 무게 x2 임
        // 3. 또 그다음 무거운 로프를 추가해서 3개의 로프로 들 수 있는 최대 무게는 이 과정에서 추가된 로프의 무게 x3 임
        int maxWeight = -1;
        for(int i = 0; i < N; i++){
            int rope = ropes.get(i);
            // 끝까지 돌아보는 코드로 변경 후 정답
            if(maxWeight < rope * (i+1))
                maxWeight = rope * (i+1);
        }
        System.out.println(maxWeight);
    }
}
