package Stack;
import java.util.Stack;

public class get_min {
    static int min = Integer.MAX_VALUE;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        push(5);
        push(2);
        pop();
        System.out.println(getMin());
    }

    public static void push(int val) {
        if(val <= min){
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public static void pop() {
        if(stack.pop() == min){
            min = stack.pop();
        }
    }

    public static int getMin() {
        return min;
    }
}