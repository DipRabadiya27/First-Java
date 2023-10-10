package Stack;

import java.util.*;

public class infix_to_prefix {
    public static void main(String[] args) {
        String prefix = "((a+b)*c)";
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) == '(') {
                continue;
            } if (prefix.charAt(i) == ')'){
                    for (int j = 0; j < prefix.length(); j++) {
                        if (prefix.charAt(i) == '+' || prefix.charAt(i) == '-' || prefix.charAt(i) == '*' || prefix.charAt(i) == '/') {
                            String first = stack.pop();
                            String second = stack.pop();
                            String inx = prefix.charAt(i) + second + first;
                            stack.push(inx);
                        } else {
                            stack.push(String.valueOf(prefix.charAt(i)));
                        }
                    }
                }
            }
            System.out.println(stack.pop());
        }
    }