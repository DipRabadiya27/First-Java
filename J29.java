public class J29 {
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6};
        int n=6;
        int ans=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(ans - sum);
    }  
}