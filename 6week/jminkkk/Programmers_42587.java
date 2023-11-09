package jminkkk;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Programmers_42587 {
    class Solution {
        public int solution(int[] priorities, int location) {
            // 특정 프로세스가 몇번째로 실행
            Queue<Process> queue = new LinkedList<Process>();
            // 인덱스별 언제 실행
            Map<Integer, Integer> indexAndCount = new HashMap<>();

            for (int i = 0; i < priorities.length; i++) {
                queue.add(new Process(priorities[i], i));
            }

            int answer = 1;
            while(!queue.isEmpty()) {
                Process p = queue.poll();

                int isHigh = (int) queue.stream().filter(i -> i.priorities > p.priorities).count();

                if (isHigh != 0) {
                    answer--;
                    queue.add(p);
                } else {
                    indexAndCount.put(p.index, answer);
                }


                answer++;
            }

            return indexAndCount.get(location); // location에 위치한 프로세스가 몇 번째로
        }
    }

    class Process implements Comparable<Process> {
        public final int priorities;
        public final int index;

        public Process(int priorities, int index) {
            this.priorities = priorities;
            this.index = index;
        }

        public int compareTo(Process p) {
            if (this.priorities > p.priorities) return 1;
            else if (this.priorities < p.priorities) return -1;
            return 0;
        }
    }
}
