
public class J19 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,3,4,5,5,9,9,5,7,8,6};
        int n = arr.length;
        int v=6;
        int count=0;
        for (int i = 0; i < n-1; i++){
            if(arr[i]==v){
                count++;
            }
        }
            if(count>1){
                System.out.print("not unique");
            } else{
                System.out.print("unique");
        }
    }
}