import java.util.Stack;
public class Programmers_12909 {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(x == '(') stack.push(x);
            else{
                if(stack.empty()) return false;
                stack.pop();
            }
        }

        if(stack.empty()) return true;
        return answer;
    }
}
