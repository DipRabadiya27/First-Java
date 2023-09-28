package String;

import java.util.Arrays;

public class update {
    public static void main(Strings[] args) {
        Strings name="Dip";
        char[] n1=name.toCharArray();
        int n=n1.length;
        for(int i=0;i<n;i++){
            if(n1[i]=='D'){
                n1[i]='P';
            }
        }
        Strings s=new Strings(n1);
        System.out.println(s);
    }
}