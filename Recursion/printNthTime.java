package Recursion;

//print 5 time name
public class printNthTime {
    static void print(int i,int n) {
        if(i>n){
            return;
        }
        System.out.println("Name");
        print(i+1,n);
    }

    public static void main(String[] args) {
        int n=5;
        print(1,n);
    }
}