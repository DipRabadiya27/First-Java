package Recursion;

//print factorial of n
public class factorial {
    // parameter 
    // static void printFactorial(int i,int multiply) {
    //     if(i < 1){
    //         System.out.println(multiply);
    //         return;
    //     }
    //     printFactorial(i-1,multiply*i);
    // }

    // function 
    static int printFactorial(int n){
        if(n==0){
            return 1;
        }
        return n * printFactorial(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int factorial=1;
        // printFactorial(n,factorial);
        System.out.println(printFactorial(n));
    }
}
