package Stack;

import java.util.*;

public class prefix_to_infix {
    public static void main(String[] args) {
        //String prefix = "+a*/*bcd-ef";
        String prefix = "*+abc";
        Stack<String> stack = new Stack<>();

        for(int i = prefix.length() - 1; i >= 0; i--) {
            if (prefix.charAt(i) == '+' || prefix.charAt(i) == '-' || prefix.charAt(i) == '*' || prefix.charAt(i) == '/') {
                String first = stack.pop();
                String second = stack.pop();
                String inx = "(" + first + prefix.charAt(i) + second + ")";
                stack.push(inx);
            } else {
                stack.push(String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(stack.pop());
    }
}