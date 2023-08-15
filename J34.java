public class J34 {
    public static void main(String[] args){
        int arr[]={1,-2,3,-1,4,5,-2,7};
        int n=arr.length;
        int sum=0;
        int cur_sum=0;
        for(int i=0;i<n;i++){
            cur_sum+=arr[i];
            if(cur_sum>sum){
                sum=cur_sum;
            } else if(cur_sum<0){
                cur_sum=0;
            }
        }
        System.out.println(sum);
    }
}