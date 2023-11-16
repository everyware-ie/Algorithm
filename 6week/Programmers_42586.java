import java.util.ArrayList;
import java.util.List;

public class Programmers_42586 {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] arr = new int[progresses.length];

        for(int i=0; i<progresses.length; i++){
            int r = 100 - progresses[i];
            if(r % speeds[i] != 0) arr[i] = r / speeds[i] + 1;
            else arr[i] = r / speeds[i];
        }

        int tmp = arr[0];
        int cnt = 1;
        for(int i=1; i<arr.length; i++){
            if(tmp < arr[i]){
                tmp = arr[i];
                answer.add(cnt);
                cnt = 1;
            }
            else {
                cnt++;
            }
        }
        answer.add(cnt);

        return answer;
    }
}
