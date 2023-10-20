package Recursion;

//fibonacci 
public class fibonacci {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return (fib(n-2)+fib(n-1));
        // int last = fib(n-1);
        // int slast = fib(n-2);
        // return last + slast;
        } 
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}