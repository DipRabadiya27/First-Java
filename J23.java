
public class J23 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int max1 = 0;
        int max2 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];     
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);


    }
}