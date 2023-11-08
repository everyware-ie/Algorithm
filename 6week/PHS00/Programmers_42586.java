package PHS00;

import java.util.*;

// 기능 개발
public class Programmers_42586 {
    class Solution {
        public List<Integer> solution(int[] progresses, int[] speeds) {
            int len = progresses.length;
            List<Integer> answer = new ArrayList<>();
            int[] endDates = new int[len];

            for(int i = 0; i < len; i++){
                while(progresses[i] < 100){
                    progresses[i] += speeds[i];
                    endDates[i]++;
                }
            }

            Queue<Integer> que = new LinkedList<>();
            que.add(endDates[0]);
            for(int i = 1; i < len; i++){
                if(que.peek() < endDates[i]){
                    int depo = countDepo(que);
                    answer.add(depo);
                }
                que.add(endDates[i]);
            }

            int depo = countDepo(que);
            answer.add(depo);

            return answer;
        }

        private int countDepo(Queue<Integer> que){
            int count = 0;
            while(!que.isEmpty()){
                que.poll();
                count++;
            }
            return count;
        }
    }
}
