package String;

import java.util.Arrays;

public class countNumber {
    public static void main(String[] args) {
        String name="My name is Dip";
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
}