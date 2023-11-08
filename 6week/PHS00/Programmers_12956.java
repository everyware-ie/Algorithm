package PHS00;

import java.util.*;

// 같은 숫자는 싫어
public class Programmers_12956 {
    public class Solution {
        public Stack<Integer> solution(int []arr) {
            Stack<Integer> answer = new Stack<>();

            answer.push(arr[0]);
            for(int i = 1; i < arr.length; i++){
                if(answer.peek() == arr[i]){
                    continue;
                }
                answer.push(arr[i]);
            }

            return answer;
        }
    }
}
