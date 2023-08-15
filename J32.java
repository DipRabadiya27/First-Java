import java.util.Arrays;

public class J32 {
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6};
        int n= arr.length;
        int d=3;
        d = d%n;
        for(int i=1;i<=d;i++){
            int t=arr[0];
            {
                for(int j=0;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[n-1]=t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
