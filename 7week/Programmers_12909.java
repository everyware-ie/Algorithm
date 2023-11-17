import java.util.*;

// 올바른 괄호
public class Programmers_12909 {

    class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '('){
                    stack.push(c);
                }
                if(c == ')'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty()){
                return false;
            }
            return true;
        }
    }
}
