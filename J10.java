public class J10 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,90};
        int n=arr.length;
        int i;
        int max=arr[0];
        for(i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}   
