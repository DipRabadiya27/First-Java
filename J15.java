import java.util.Arrays;

public class J15 {
    public static void main(String[] args){
        int[] arr = {2,5,8,6};
        int n=arr.length;
        int i;
        int arr1[]=new int[n*2];
        // int j=0;
        for(i=0;i<n;i++){
            arr1[i]=arr[i];
            // j++;
            arr1[i+n]=arr[i];
            // j++;
        }
        System.out.println(Arrays.toString(arr1));
    }   
}