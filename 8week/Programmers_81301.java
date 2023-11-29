// 숫자 문자열과 영단어
public class Programmers_81301 {
    static String string = "";
    static String word = "";
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            int temp = s.charAt(i) - '0';
            if(temp < 10){
                // 숫자인경우
                string += s.charAt(i);
            }else{
                word += s.charAt(i);
                check();
            }

        }
        answer = Integer.parseInt(string);
        return answer;
    }

    public void check(){

        switch(word){
            case "zero" : string += 0; word = ""; break;
            case "one" : string += 1; word = ""; break;
            case "two" : string += 2; word = ""; break;
            case "three" : string += 3; word = ""; break;
            case "four" : string += 4; word = ""; break;
            case "five" : string += 5; word = ""; break;
            case "six" : string += 6; word = ""; break;
            case "seven" : string += 7; word = ""; break;
            case "eight" : string += 8; word = ""; break;
            case "nine" : string += 9; word = ""; break;
        }
    }
}
