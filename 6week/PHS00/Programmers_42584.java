package PHS00;

// 주식 가격
public class Programmers_42584 {
    class Solution {
        public int[] solution(int[] prices) {
            int n = prices.length;
            int[] answer = new int[n];

            for(int i = 0; i < n-1; i++){
                for(int j = i+1; j < n; j++){
                    answer[i]++;
                    if(prices[i] > prices[j]){
                        break;
                    }
                }
            }

            return answer;
        }
    }
}
