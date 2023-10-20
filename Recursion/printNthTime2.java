package Recursion;

//print 1 to n by bactracking
public class printNthTime2 {
    public static void print(int i,int n) {
        if(i < 1){
            return;
        }
        
        print(i-1,n);  
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n=10;
        print(n,n);
    }
}