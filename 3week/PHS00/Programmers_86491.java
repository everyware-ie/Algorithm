package PHS00;

public class Programmers_86491 {
    class Solution {
        public int solution(int[][] sizes) {
            for(int i = 0; i < sizes.length; i++){
                if(sizes[i][0] < sizes[i][1]){
                    swap(sizes, i);
                }
            }
            int maxW = findMaxNum(sizes, 0);
            int maxH = findMaxNum(sizes, 1);

            int answer = maxW * maxH;
            return answer;
        }

        public void swap(int[][] sizes, int index){
            int temp = sizes[index][0];
            sizes[index][0] = sizes[index][1];
            sizes[index][1] = temp;
        }

        public int findMaxNum(int[][] sizes, int column){
            int max = 0;
            for(int i = 0; i < sizes.length; i++){
                if(max < sizes[i][column])
                    max = sizes[i][column];
            }
            return max;
        }
    }
}
