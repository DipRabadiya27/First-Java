package Stack;

import java.util.*;

import String.shortString;

public class infix_to_prefix {
    public static void main(String[] args) {
        String path = "/home/";
        Stack<String> st = new Stack<>();
        int p1 = 0;
        int p2 = 0;
        while (p2 <= path.length()) {
            if (p2 < path.length() && path.charAt(p2) == '/' || p2 == path.length()) {
                String word = path.substring(p1, p2);
                if (word.equals(".") || word.equals("")) {
                    p2++;
                    p1 = p2;
                    continue;
                } else if (word.equals("..")) {
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                } else {
                    st.add(word + "/");
                }
                p2++;
                p1 = p2;
            } else {
                p2++;
            }
        }
        System.out.println(st);
    }
}