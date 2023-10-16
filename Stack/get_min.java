package Stack;

import java.util.Stack;

public class get_min {
    //static int min = Integer.MAX_VALUE;
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minstack = new Stack<>();

    public static void main(String[] args) {
        push(5);
        push(2);
        pop();
        push(1);
        push(1);
        pop();
        System.out.println(getMin());
    }

    // public static void push(int val) {
    // if (val <= min) {
    // stack.push(min);
    // min = val;
    // }
    // stack.push(val);
    // }

    // public static void pop() {
    // if (stack.pop() == min) {
    // min = stack.pop();
    // }
    // }

    // public static int getMin() {
    // return min;
    // } 

    private static void push(int value) {
    stack.push(value);
    if (minstack.isEmpty()) {
        minstack.push(value);
    } else if (minstack.peek() >= value) {
        minstack.push(value);
    }
}

private static int getMin() {
    return minstack.peek();
}

private static void pop() {
    int temp = stack.pop();
    if (temp == minstack.peek()) {
        minstack.pop();
    }
}
}
// private static void push(int value) {
//     stack.push(value);
//     if (minstack.isEmpty()) {
//         minstack.push(value);
//     } else if (minstack.peek() >= value) {
//         minstack.push(value);
//     }
// }

// private static int getMin() {
//     return minstack.peek();
// }

// private static void pop() {
//     int temp = stack.pop();
//     if (temp == minstack.peek()) {
//         minstack.pop();
//     }
// }