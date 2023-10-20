package Recursion;
import java.util.*;

//A string is palidrom or not
public class palindrome {
    static boolean rev(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        } else {
        return rev(i+1,s);
        }
    }

    public static void main(String[] args) {
        String s="madan";
        System.out.println(rev(0,s));
    }
}