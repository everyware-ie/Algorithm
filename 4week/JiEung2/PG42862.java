package JiEung2;

import java.util.*;
public class PG42862 {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n-lost.length;
            int rCheck[] = new int[reserve.length];
            int lCheck[] = new int[lost.length];
            Arrays.sort(lost);
            Arrays.sort(reserve);
            int j = 0;
            for(int l : lost){
                for(int i=0; i<reserve.length; i++){
                    if(l == reserve[i]){
                        rCheck[i] = 1;
                        lCheck[j] = 1;
                        answer++;
                        break;
                    }
                }
                j++;
            }
            j = 0;
            for(int l : lost){

                for(int i=0; i<reserve.length; i++){
                    if(rCheck[i] == 1 || lCheck[j] == 1) continue;
                    else if((reserve[i] == l-1) || (reserve[i] == l+1)){
                        rCheck[i] = 1;
                        lCheck[j] = 1;
                        answer++;
                        break;
                    }
                }
                j++;
            }
            return answer;
        }
    }
}
