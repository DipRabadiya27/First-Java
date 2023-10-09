package Stack;

import java.util.Stack;

public class postfix_to_prefix {
    public static void main(String[] args) {
        String prefix = "abc*d/ef-*+";
        Stack<String> stack = new Stack<>();

        for (int i =0; i<prefix.length(); i++) {
            if (prefix.charAt(i) == '+' || prefix.charAt(i) == '-' || prefix.charAt(i) == '*'
                    || prefix.charAt(i) == '/') {
                String first = stack.pop();
                String second = stack.pop();
                String inx = prefix.charAt(i) + second + first ;
                stack.push(inx);
            } else {
                stack.push(String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(stack.pop());
    }
}
