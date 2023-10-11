package Stack;

import java.util.Arrays;
import java.util.Stack;

public class two_stack_array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int l=-1;
        int r=arr.length;
        l=pushFirst(arr, l, r, 10);
        l=pushFirst(arr, l, r, 20);
        l=pushFirst(arr, l, r, 30);
        l=pushFirst(arr, l, r, 40);
        l=pushFirst(arr, l, r, 50);
        l=pushFirst(arr, l, r, 60);
        r=pushSecond(arr, l, r, 100);
        r=pushSecond(arr, l, r, 90);
        r=pushSecond(arr, l, r, 80);
        r=pushSecond(arr, l, r, 70);
        // l=popFirst(arr, l, r);
        // r=popSecond(arr, l, r);
        printFirst(arr, l);
        System.out.println();
        printSecond(arr, r);
    }

    public static int pushFirst(int[] arr,int l,int r,int value){
        if(l==r-1){
            System.out.println("Stack is full");
        } else {
        l++;
        arr[l]=value;
        }
        return l;
    }

    public static int pushSecond(int[] arr,int l,int r,int value){
        if(r==l+1){
            System.out.println("Stack is full");
        } else {
        r--;
        arr[r]=value;
        }
        return r;
    }

    public static int popFirst(int[] arr,int l,int r){
        if(l==-1){
            System.out.println("Stack is empty");
        } else {
        l--;
        }
        return l;
    }
    public static int popSecond(int[] arr,int l,int r){
        if(r==arr.length){
            System.out.println("Stack is empty");
        }
        r++;
        return r;
    }

    private static void printFirst(int[] arr, int l) {
        if(l == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=l;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    private static void printSecond(int[] arr, int r) {
        if(r == arr.length){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=r;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}