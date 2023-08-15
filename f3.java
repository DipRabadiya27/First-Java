import java.util.*;

public class f3 {
    public static void calculateFact(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact =1;
        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFact(n);
    }
}