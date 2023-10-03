package Stack;

public class palindrom {
    public static void main(String[] args) {
        String str="naman";
        int top=-1;
        char[] stack=new char[str.length()];
        for(int i=0;i<str.length();++i)
        {
            top=push(stack,top,str.charAt(i));
        }
        for(int i=0;i<str.length();++i)
        {
            if(str.charAt(i)!=peek(stack,top))
            {
                System.out.println("false");
                return;
            }
            top=pop(stack,top);
        }
        System.out.println("true");
    }

    private static char peek(char[] stack, int top) {
        return stack[top];
    }

    private static int pop(char[] stack, int top) {
        top--;
        return top;
    }

    private static int push(char[] stack,int top,char value)
    {
        if(top==stack.length-1)
        {
            System.out.println("Stack is overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
}