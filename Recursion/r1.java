package Recursion;

public class r1 {
    static int count=0;
    public static void print() {
        if(count == 4){
            return;
        }
        System.out.println("Hello");
        count++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
