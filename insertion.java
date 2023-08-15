//import java.util.*;

public class insertion {
    public static void main(String[] args) {
        int arr[]= {7,8,3,1,2,9};
        
        //time complexity = O(n^2)
        //selection short
        for(int i=1; i<arr.length; i++){ // n-1
            int current =arr[i];
            int j=i-1;
                while(j >= 0 && current < arr[j] ){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;

            }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
    }
    System.out.println();
    }
}