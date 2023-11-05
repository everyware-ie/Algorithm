package JiEung2;

import java.util.Arrays;

public class Programmers_42884 {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        int cam = Integer.MIN_VALUE;
        for(int[] route : routes){
            if(cam < route[0]){
                cam = route[1];
                answer++;
            }
        }
        return answer;
    }
}
