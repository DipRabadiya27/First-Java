package Recursion;

//print sum of first N number
public class sum {
    // parameter 
    // static void printSum(int i,int sum) {
    //     if(i < 1){
    //         System.out.println(sum);
    //         return;
    //     }
    //     printSum(i-1,sum+i);
    // }

    //function 
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        // printSum(n,sum);
        System.out.println(sum(n));
        
    }
}
