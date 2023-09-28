package String;

public class palindrom {
    public static void main(Strings[] args) {
        String s = "madam";
        int left = 0;
        int right = s.length()-1;

        if(s.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("String is not palindrome");
                return;
            }else {
                left++;
                right--;
            }
        }
        System.out.println("String is palindrome");
    }
}