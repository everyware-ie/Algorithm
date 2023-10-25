package JiEung2;
import java.util.*;
public class PG86491 {
    public int solution(int[][] sizes) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pQ2 = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                pQ.add(sizes[i][0]);
                pQ2.add(sizes[i][1]);
            }
            else{
                pQ.add(sizes[i][1]);
                pQ2.add(sizes[i][0]);
            }
        }

        answer = pQ.peek() * pQ2.peek();
        return answer;
    }

}
