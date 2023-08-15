import java.util.*;

public class f2 {
    public static int calculateMulti(int a, int b){
        int multi = a * b;
        return multi;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multi = calculateMulti(a, b);
        System.out.println(multi);
    }
}