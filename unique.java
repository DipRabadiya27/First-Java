
public class unique {
    public static void main(String[] args) {
        int[] arr = {1,6,2,5,3,1,9,8,5,2,5};
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