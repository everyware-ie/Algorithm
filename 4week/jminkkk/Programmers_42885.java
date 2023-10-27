import java.util.*;

class Programmers_42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int index = 0;

        for (int i = people.length - 1; i >= index; i--) { // 가장 무거운 사람부터
            if (people[i] + people[index] <= limit) { // 둘이 같이 탈 수 있으면
                index++; // 다음 사람으로
                answer++;
            }

            else {
                answer++;
            }
        }

        return answer;
    }
}