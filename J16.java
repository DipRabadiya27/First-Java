import java.util.Arrays;

public class J16 {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int n=arr1.length;
        int[] arr3=new int[2*n];
        int ind =0;
        for(int i=0;i<n;i++){
            arr3[ind]=arr1[i];
            ind++;
            arr3[ind]=arr2[i];
            ind++;
        }
        System.out.println(Arrays.toString(arr3));
    }
     
    }

