public class rc21 {
    static int count=0;
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        
        
        if(n==1){
            System.out.println("transfer disk" + n + "from" +src+ "to" +dest + count++);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        
        System.out.println("transfer disk" + n + "from" +src+ "to" +dest + count++);
        

        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        int n = 10;
        towerOfHanoi(n, "S", "H", "D");
        System.out.println(count);
    }
}