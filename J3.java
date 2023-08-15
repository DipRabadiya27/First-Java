public class J3 {
    public static void main(String[] args){
        int[] arr = {2,5,8,6,1,6,2};
        int n=arr.length;
        int v=4;
        for(int i=0; i<n; i++){
            if(arr[i]==v){
                System.out.println("value is present");
                return;
            }
        }
        System.out.println("value is not present");
    }   
}
