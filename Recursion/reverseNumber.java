package Recursion;

//print n to 1 
public class reverseNumber {
    public static void print(int i,int n) {
        if(i < 1){
            return;
        }
        System.out.println(i);
        print(i-1,n);
    }

    public static void main(String[] args) {
        int n=10;
        print(n,n);
    }
}