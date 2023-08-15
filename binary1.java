
public class binary1{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9,7,11,12,15,49,55,58};
        int left = 0;
        int right = arr.length - 1;
        int v = 59;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == v){
                System.out.println("value is present");
                return;
            }
            else if(v > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        System.out.println("value not present");
    }
}
