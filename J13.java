public class J13 {
    public static void main(String[] args){
        int[] arr = {2,5,8,6,1,6,2};
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            int temp=arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }
    } 
}  
