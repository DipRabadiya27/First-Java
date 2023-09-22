



public class J25{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int left = 0;
        int right = arr.length - 1;
        int v = 9;

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