package JiEung2;
import java.util.*;
public class PG42840 {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] thr = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        for(int i=0; i<answers.length; i++){
            if(one[i%5] == answers[i]) cnt[0]++;
            if(two[i%8] == answers[i]) cnt[1]++;
            if(thr[i%10] == answers[i]) cnt[2]++;
        }

        int max = 0;
        int index = -1;

        for(int i=0; i<3; i++){
            if(max<cnt[i]){
                max = cnt[i];
                index = i+1;
            }
        }
        answer.add(index);
        for(int i=0; i<3; i++){
            if(max==cnt[i] && i+1 != index){
                answer.add(i+1);
            }
        }



        return answer;
    }
}
