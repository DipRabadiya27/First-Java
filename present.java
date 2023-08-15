
public class present {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        int v = 30;
        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                System.out.print(v+"present");
                return;
            }
        }
        System.out.println(v+"not present");
    }
}

