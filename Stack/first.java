package Stack;

public class first {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        print(stack, top);
        top = push(stack,top,10);
        top = push(stack,top,20);
        top = push(stack,top,30);
        top = push(stack,top,40);
        top = push(stack,top,50);
        print(stack,top);
        top = pop(stack,top);
        System.out.println();
        print(stack, top);
        System.out.println();
        top = push(stack,top,50);
        print(stack,top);
        Peek(stack,top);
        System.out.println("is empty: " + isEmpty(top));
        System.out.println("Size: " + size(top));
    }

    public static boolean isEmpty(int top){
        if(top == -1) {
            return true;
        }
        return false;
    }

    public static int size(int top){
        return top+1;
    }

    private static void Peek(int[] Stack, int top) {
            System.out.println("peek element is:" + Stack[top]);
    }

    private static int pop(int[] stack, int top) {
        if(top == -1){
            System.out.println("Stack is empty");
            return top;
        }
        System.out.print("pop value: " + stack[top]);
        top--;
        return top;
    }

    private static void print(int[] stack, int top) {
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }

    private static int push(int[] stack, int top, int value) {
        if(top == stack.length-1){
            System.out.println("stack is full");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
}