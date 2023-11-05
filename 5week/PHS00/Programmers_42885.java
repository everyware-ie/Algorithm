package PHS00;

import java.util.*;
public class Programmers_42885 {

    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            Arrays.sort(people);
            int lp = 0;
            int rp = people.length - 1;
            while(lp <= rp){
                if(people[lp] + people[rp] <= limit){
                    answer++;
                    lp++;
                    rp--;
                }else{
                    rp--;
                    answer++;
                }

            }

            return answer;
        }
    }
}
