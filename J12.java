public class J12 {
    public static void main(String[] args){
        int[] arr = {2,5,8,6,1,6,2};
        int n=arr.length;
        int i;
        int arr1[]=new int[n];
        for(i=n-1;i>=0;i--){
            arr1[i]=arr[i];
            System.out.print(arr1[i]);
        }
    }
}   
