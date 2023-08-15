public class J26 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum = 20;
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            if (arr[left] + arr[right] == sum) {
                System.out.println("pair is: " + " " + arr[left] + "," + arr[right]);
                return;
            } else if (arr[left] + arr[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("pair is not");
    }
}