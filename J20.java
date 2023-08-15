
public class J20 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,3,4,5,5,9,9,5,7,8,6};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int c=0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                c++;
                }    
            }
            if(c==1){
            System.out.print(arr[i] + " ");
            }
        }
    }
}