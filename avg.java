
public class avg{
    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        int n=arr.length;
        int sum=0;
        int avg;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        avg=sum/n;
        System.out.println(avg);
    }
}