package JiEung2;

public class Programmers_43883 {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index=0;
        for(int i=0; i<number.length()-k; i++){
            int max = 0;
            for(int j=index; j <= k+i; j++){
                if(max < number.charAt(j) - '0'){
                    max = number.charAt(j) - '0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
