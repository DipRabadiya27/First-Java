package Stack;

import java.util.Stack;

public class prefix_to_postfix {
    public static void main(String[] args) {
        String prefix = "+a*/*bcd-ef";
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            if (prefix.charAt(i) == '+' || prefix.charAt(i) == '-' || prefix.charAt(i) == '*' || prefix.charAt(i) == '/') {
                String first = stack.pop();
                String second = stack.pop();
                String inx =first +  second + prefix.charAt(i);
                stack.push(inx);
            } else {
                stack.push(String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(stack.pop());
    }
}