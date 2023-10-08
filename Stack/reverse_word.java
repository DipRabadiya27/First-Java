package Stack;

import java.util.Stack;

public class reverse_word {
    public static void main(String[] args) {
        String s = "Hello Good Morning";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            } else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}