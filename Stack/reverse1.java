package Stack;

public class reverse1 {
    public static void main(String[] args) {
        String str = new String("hello wolrd");
        int top = -1;
        char stack[] = new char[str.length()];
        for (int i = 0; i < str.length(); ++i) {
            top = push(stack, top, str.charAt(i));
        }
        print(stack, top);
    }

    private static void print(char[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack");
            return;
        }
        for (int i = top; i >= 0; --i) {
            System.out.print(stack[i]);
        }
    }

    private static int push(char[] stack, int top, char item) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return top;
        }
        top++;
        stack[top] = item;
        return top;
    }

}
