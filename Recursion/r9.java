package Recursion;

//A string is palidrom or not
public class r9 {
    static boolean rev(int i,String s, int n){
        if(i>=n/2){
            return true;
        }
        if(s[i]!=s[n-i-1]){
            return false;
        } else {
        return rev(i+1,s, n);
        }
    }

    public static void main(String[] args) {
        String s="MADAM";
        int n=s.length();
        rev(0,s,n);
    }
}
