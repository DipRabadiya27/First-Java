package Stack;

import java.util.*;

public class palindromee {
    public static void main(String[] args) {
        String s = "naman";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != stack.peek()) {
                System.out.println("false");
                return;
            } else {
                stack.pop();
            }
        }
        System.out.println("true");
    }
}