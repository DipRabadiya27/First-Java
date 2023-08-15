public class J9 {
    public static void main(String[] args){
        int[] arr = {2,5,8,6,1,6,2};
        int n=arr.length;
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
            }
         }
         System.out.println(); 
         for(int i=0;i<n;i++){
            if(arr[i]%2!=0) {
                System.out.print(arr[i]);
            }
        }
    }   
}
