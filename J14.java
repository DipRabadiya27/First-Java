public class J14 {
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6,7,8};
        int n=arr.length;
        int v=5;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]<v){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
