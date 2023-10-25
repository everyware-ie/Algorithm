import java.util.HashSet;

public class Programmers_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 체육복을 빌리지 못한 학생 수

        HashSet<Integer> notLend = new HashSet<>();
        for (int k : reserve) {
            notLend.add(k);
        }

        for (int i = 0; i < lost.length; i++) {
            if (notLend.contains(lost[i])) {
                answer++;
                notLend.remove(lost[i]);
                lost[i] = -1;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (notLend.contains(lost[i] - 1)) {
                answer++;
                notLend.remove(lost[i] - 1);
            } else if (notLend.contains(lost[i] + 1)) {
                answer++;
                notLend.remove(lost[i] + 1);
            }
        }
        return answer;
    }
}
