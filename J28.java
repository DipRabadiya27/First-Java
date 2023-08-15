public class J28 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
        while(left<right){
            if(arr[left]%2!=0){
                left++;
            } else if (arr[right]%2==0){
                right--;
            } else {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(arr[i]);
    }
    
}
}
