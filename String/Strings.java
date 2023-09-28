package String;

import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void getShortestPath(String path) {
        int x=0, y=0;

        for(int i=0; i<path.length();i++) {
            char dir=path.charAt(i);
            //South
            if(dir == 'S') {
                y--;
            } //North
            else if(dir == 'N'){
                y++;
            } //West
            else if(dir =='W'){
                x--;
            } //East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        //return  (float)Math.sqrt(X2 + Y2);
        System.out.println((float)Math.sqrt(X2 + Y2));
    }

    public static void printPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)) {
                System.out.println("String is Not Palindrome");
                return;
            } else {
                left++;
                right--;
            }
        }
        System.out.println("String is Palindrome");
    }

    public static void subString(String str, int si,int ei) {
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        System.out.println(substr);
    }

    public static void largestString(String[] str){
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        /*char[] arr = {'a','b','c','d','e','f'};
        String str = "abcdef";
        String str1 = new String("XYZ");
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str1);*/

        //Strings are immutable

        /*Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());*/

        //concatenation
        /*String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));*/

        //printLetters(fullName);

        //printPalindrome(firstName);

        String path = "WNEENESENNN";
        getShortestPath(path);

        String ss = "HelloWorld";
        System.out.println(ss.substring(0,5));
        subString(ss, 0, 5);

        String[] fruits = {"apple", "mango", "banana"};
        largestString(fruits);
    }
}