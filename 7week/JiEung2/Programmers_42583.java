package JiEung2;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int currentWeight = 0;

        for(int truck : truck_weights){
            while(true){
                if(queue.isEmpty()){
                    queue.add(truck);
                    currentWeight += truck;
                    answer++;
                    break;
                }
                else if(queue.size() == bridge_length) {
                    currentWeight -= queue.poll();
                }
                else{
                    if(currentWeight + truck <= weight){
                        queue.add(truck);
                        currentWeight += truck;
                        answer++;
                        break;
                    }
                    else {
                        queue.add(0);
                        answer++;
                    }
                }
            }
        }
        return answer += bridge_length;
    }
}
