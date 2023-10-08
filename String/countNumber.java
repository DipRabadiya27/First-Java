package String;

import java.util.Arrays;

public class countNumber {
    public static void main(String[] args) {
        String name="My name is Dip ";
        name=name.trim();
        int count=1;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}