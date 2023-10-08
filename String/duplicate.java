package String;

public class duplicate {
    public static void main(String[] args) {
        String str = "naman is a naman";
        int arr[] = new int[128];
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                int ascii = str.charAt(i);
                if (arr[ascii] == 0) {
                    arr[ascii] = arr[ascii] + 1;
                } else if (arr[ascii] == 1) {
                    arr[ascii] = arr[ascii] + 1;
                    char c = str.charAt(i);
                    System.out.print(c);
                }
            }
        }
    }
}