package String;

import java.util.Arrays;

public class practises{
    public static void main(String[] args) {
        // String n="abcdefghijjkl";
        // char c='g';
        // int index=n.indexOf(c);
        // System.out.println(index);

        // if(index == -1){
        //     System.out.println(n);
        //     return;
        // }
        // StringBuilder sb= new StringBuilder(n.substring(0, index+1));
        // System.out.println(sb);

        // String str=sb.reverse().toString()+n.substring(index+1);
        // System.out.println(str);

    String s="123003400";
    int n = s.length()-1;
        for(int i = n ;i>0; i--){
            if(s.charAt(i) != '0'){
                break;
            }
            n--;
        }
        System.out.println(s.substring(0,n+1));
    }
}