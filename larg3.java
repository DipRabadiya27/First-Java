
public class larg3 {
    public static void main(String[] args) {
        int[] arr = {1,8,9,2,10,5,0,2};
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max3 = max2;
                max2=arr[i];
            }
            else if(arr[i]>max3){
                max3 = arr[i];
            }
        }
        System.out.println(max3);
    }
}