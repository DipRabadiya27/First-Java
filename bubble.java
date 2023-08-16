//import java.util.*;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int arr[]= {7,8,3,1,2};
        
        //time complexity = O(n^2)
        //bubble short
        for(int i=0; i<arr.length-1; i++){ // n-1
            System.out.println("Hear");
            for (int j=0; j<arr.length-i-1; j++){ // 
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}