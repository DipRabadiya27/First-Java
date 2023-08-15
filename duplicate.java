
public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,6,5,3,6,1,9,8,5,2,5};
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            {
            if(arr[i]<0)
            continue;
            }
            int c=0;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                c++;
                arr[j] = arr[j] *-1;
                }    
            }
            if(c>=1){
            System.out.print(arr[i] + " ");
            }
        }
    }
}