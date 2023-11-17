import java.util.*;

// 다리를 지나는 트럭
public class Programmers_42583 {

    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            int now = 0;
            Queue<Integer> que = new LinkedList<>();
            Queue<Integer> wait = new LinkedList<>();
            for(int i = 0; i < truck_weights.length; i++){
                wait.add(truck_weights[i]);
            }
            while(true){
                if(wait.isEmpty()){
                    return answer+bridge_length;
                }

                answer++;
                if(que.size() == bridge_length){
                    now -= que.poll();
                }
                if(!wait.isEmpty() && now + wait.peek() <= weight){
                    now += wait.peek();
                    que.add(wait.poll());
                }else{
                    que.add(0);
                }

            }

        }
    }
}
