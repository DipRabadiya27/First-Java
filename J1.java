public class J1 {
    public static void main(String[] args){
        int[] arr = {2,5,8,6,1,6,2};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    } 
}
