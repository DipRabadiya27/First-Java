package String;

import java.util.Arrays;

public class update {
    public static void main(String[] args) {
        String name="Dip";
        char[] n1=name.toCharArray();
        int n=n1.length;
        for(int i=0;i<n;i++){
            if(n1[i]=='D'){
                n1[i]='P';
            }
        }
        System.out.println(new String(n1));
    }
}