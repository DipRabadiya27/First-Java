package Recursion;
import java.util.*;

//A string is palidrom or not
public class r9 {
    static boolean rev(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s[i] != [s.length()-i-1]){
            return false;
        } else {
        return rev(i+1,s);
        }
    }

    public static void main(String[] args) {
        String s="MADAM";
        rev(0,s);
    }
}
