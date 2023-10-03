package Stack;

public class reverse2 {
    public static void main(String[] args) {
       String str="hello how are you!";
       int top=-1;
       char[] stack=new char[str.length()];
       for(int i=0;i<str.length();++i)
       {
           if(str.charAt(i)==' ')
           {
               while(!isEmpty(top))
               {
                   top=pop(stack,top);
               }
               System.out.print(" ");
           }else {
               top=push(stack,top,str.charAt(i));
           }
       }
        while(!isEmpty(top))
        {
            top=pop(stack,top);
        }
    }

    private static int pop(char[] stack, int top) {
        System.out.print(stack[top]);
        top--;
        return top;
    }

    private static int push(char[] stack, int top,char item) {
            top++;
            stack[top]=item;
            return top;
    }

    private static boolean isEmpty(int top)
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
}

// package Stack_Queue;
// import java.util.*;
// //02-08-2023
// //Reverse a number using stack.
// public class Reverse_Number {
//     public static void main(String[] args) {
//         int num = 12345;
//         Stack<Integer> stack = new Stack<>();

//         while (num != 0){
//             stack.push(num % 10);
//             num /= 10;
//         }
//         int i=1;
//         while (!stack.isEmpty()){
//             num = (stack.pop() * i) + num;
//             i *= 10;
//         }
//         System.out.println(num);
//     }
// }
