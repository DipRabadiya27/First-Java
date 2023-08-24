public class J31 {
    public static void main(String args[]){
        int n=5055;
        int rev=0;
        int r=0;
        while(n!=0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}