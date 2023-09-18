package String;

import java.util.Arrays;

public class countNumber {
    public static void main(String[] args) {
        String name="My name is Dip";
        int count=0;
        // String[] string = name.split(" ");
        // for(int i=0; i<string.length; i++){
        //     count+=string[i].length();
        // }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == ' '){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}