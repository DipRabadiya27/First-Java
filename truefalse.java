
public class truefalse {
    public static void main(String[] args) {
        int[] arr = {20,28,27,8,9};
        int n = arr.length;
        int v = 9;
        int c=0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == v){
                c++;
            }
        }
        if(c>1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}