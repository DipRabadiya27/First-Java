package Stack;

import java.util.*;

public class postfix_to_infix {
    public static void main(String[] args) {
        String prefix = "abfc++c/";
        Stack<String> stack = new Stack<>();

        for (int i =0; i<prefix.length(); i++) {
            if (prefix.charAt(i) == '+' || prefix.charAt(i) == '-' || prefix.charAt(i) == '*' || prefix.charAt(i) == '/') {
                String first = stack.pop();
                String second = stack.pop();
                String inx = "(" + second + prefix.charAt(i) + first + ")";
                stack.push(inx);
            } else {
                stack.push(String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(stack.pop());
    }
}