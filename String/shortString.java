package String;

import java.util.Arrays;

public class shortString {
    public static void main(String[] args) {
        String name = "DipRabadiya";
        char[] s = name.toCharArray();

        for(int i=0; i<s.length-1; i++){
            for(int j=i+1; j<s.length; j++){
                if(s[i] > s[j]){
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println(new String(s));
    }
}