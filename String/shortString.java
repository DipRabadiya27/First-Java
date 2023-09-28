package String;

import java.util.Arrays;

public class shortString {
    public static void main(Strings[] args) {
        String name = "DipRabadiya";
        char[] s = name.toCharArray();

        for(int i=0; i<s.length; i++){
            for(int j=i+1; j<s.length; j++){
                if(s[i] > s[j]){
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        String name1 = new String(s);
        System.out.println(name1);
    }
}