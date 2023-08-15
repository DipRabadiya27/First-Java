public class J27 {
    public static void main(String args[]){
        int arr[]={0,1,1,0,1,0,0,1,1};
        int n=arr.length;
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
        while(left<right){
            if(arr[left]==0){
                left++;
            } else if (arr[right]==1){
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
